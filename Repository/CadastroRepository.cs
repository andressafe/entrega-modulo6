using destinocerto_csharp.Database;
using destinocerto_csharp.Models;
using Microsoft.EntityFrameworkCore;

namespace destinocerto_csharp.Repository
{
    public class CadastroRepository : ICadastroRepository
    {
        //injetar dependencia do contexto
        private readonly CadastroDbContext _context;

        public CadastroRepository(CadastroDbContext context){
            _context = context;
        }
       public void AddCadastro(Cadastro cadastro) 
       {
          _context.Add(cadastro);
       }
        public void AtualizarCadastro(Cadastro cadastro)
        {
            _context.Update(cadastro);
        }

        public void DeletarCadastro(Cadastro cadastro)
        {
            _context.Remove(cadastro);
        }

        public async Task<Cadastro> GetCadastroById(int id)
        {
            return await _context.cadastros.Where(x => x.Id == id)
                .FirstOrDefaultAsync();
        }

        public async Task<IEnumerable<Cadastro>> GetCadastros()
        {
            return await _context.cadastros.ToListAsync();
        }

        public async Task<bool> SaveChangesAsync()
        {
            return await _context.SaveChangesAsync() > 0;
        }
    }
}