using destinocerto_csharp.Repository;
using Microsoft.AspNetCore.Mvc;
using destinocerto_csharp.Models;

namespace destinocerto_csharp.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class CadastroController : ControllerBase
    {
        //injetar dependencia do repositorio
        private readonly ICadastroRepository _repository;

        public CadastroController(ICadastroRepository repository) {
           _repository = repository; 
        }

        [HttpGet]
        public async Task<IActionResult> GetAll(){
            var cadastros = await _repository.GetCadastros();
            return cadastros.Any() ? Ok(cadastros) : NoContent();
        }
        [HttpGet("{id}")]
        public async Task<IActionResult> GetById(int id){
            var cadastro = await _repository.GetCadastroById(id);
            return cadastro != null
            ? Ok(cadastro) : NotFound("Cadastro não encontrado.");
        }

            [HttpPost]
        public async Task<IActionResult> Post(Cadastro cadastro){
           _repository.AddCadastro(cadastro);
           return await _repository.SaveChangesAsync() ? Ok("Cadastro adicionado") : BadRequest("Algo deu errado.");
        }
        [HttpPut("{id}")]
        public async Task<IActionResult> Atualizar(int id, Cadastro cadastro){
            var cadastroExiste = await _repository.GetCadastroById(id);
            if(cadastroExiste == null) return NotFound("Cadastro não encontrado.");

            cadastroExiste.Nome = cadastro.Nome ?? cadastroExiste.Nome;
            cadastroExiste.Data_Nascimento = cadastro.Data_Nascimento != new DateTime() ? cadastro.Data_Nascimento : cadastroExiste.Data_Nascimento;

            _repository.AtualizarCadastro(cadastroExiste);
            return await _repository.SaveChangesAsync() ? Ok("Cadastro atualizado") : BadRequest("Algo de errado.");
        }

        [HttpDelete("{id}")]
        public async Task<IActionResult> Delete(int id) {
           var cadastroExiste = await _repository.GetCadastroById(id);
            if(cadastroExiste == null) return NotFound("Cadastro não encontrado.");

            _repository.DeletarCadastro(cadastroExiste);
         
         return await _repository.SaveChangesAsync() ? Ok("Cadastro atualizado") : BadRequest("Algo de errado.");
        }
        
        }
   }

