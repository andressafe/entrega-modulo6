using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace destinocerto_csharp.Migrations
{
    public partial class AtualizaCadastros : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_cadastros",
                table: "cadastros");

            migrationBuilder.RenameTable(
                name: "cadastros",
                newName: "usuario");

            migrationBuilder.RenameColumn(
                name: "Nome",
                table: "usuario",
                newName: "nome");

            migrationBuilder.RenameColumn(
                name: "Data_Nascimento",
                table: "usuario",
                newName: "data_nascimento");

            migrationBuilder.RenameColumn(
                name: "Id",
                table: "usuario",
                newName: "id");

            migrationBuilder.AddPrimaryKey(
                name: "PK_usuario",
                table: "usuario",
                column: "id");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropPrimaryKey(
                name: "PK_usuario",
                table: "usuario");

            migrationBuilder.RenameTable(
                name: "usuario",
                newName: "cadastros");

            migrationBuilder.RenameColumn(
                name: "nome",
                table: "cadastros",
                newName: "Nome");

            migrationBuilder.RenameColumn(
                name: "data_nascimento",
                table: "cadastros",
                newName: "Data_Nascimento");

            migrationBuilder.RenameColumn(
                name: "id",
                table: "cadastros",
                newName: "Id");

            migrationBuilder.AddPrimaryKey(
                name: "PK_cadastros",
                table: "cadastros",
                column: "Id");
        }
    }
}
