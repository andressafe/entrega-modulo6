using destinocerto_csharp.Models;

namespace destinocerto_csharp.Repository
{
    public interface ICadastroRepository
    {
       Task<IEnumerable<Cadastro>> GetCadastros();
       Task<Cadastro> GetCadastroById(int id);
       void AddCadastro(Cadastro cadastro);
       void AtualizarCadastro(Cadastro cadastro);
       void DeletarCadastro(Cadastro cadastro);
       Task<bool> SaveChangesAsync();



       

    }
}