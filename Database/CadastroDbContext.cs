using destinocerto_csharp.Models;
using Microsoft.EntityFrameworkCore;

namespace destinocerto_csharp.Database
{
    public class CadastroDbContext : DbContext
    {
        public CadastroDbContext(DbContextOptions<CadastroDbContext>
        options) :base(options) {

        }

        public DbSet<Cadastro> cadastros { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder){
        var cadastro = modelBuilder.Entity<Cadastro>();
        cadastro.ToTable("cadastro");
        cadastro.HasKey(x => x.Id);
        cadastro.Property(x => x.Id).HasColumnName("id").ValueGeneratedOnAdd();
        cadastro.Property(x => x.Nome).HasColumnName("nome").IsRequired();
        cadastro.Property(x => x.Data_Nascimento).HasColumnName("data_nascimento").IsRequired();

        }

         }
    }
