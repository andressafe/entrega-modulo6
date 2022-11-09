using destinocerto_csharp.Database;
using destinocerto_csharp.Repository;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

var ConnectionMySql = builder.Configuration.
GetConnectionString("DefaultConnection");
builder.Services.AddDbContext<CadastroDbContext>(
    options => options.UseMySql(ConnectionMySql,
ServerVersion.Parse("8.0.30-mysql"))
);

builder.Services.AddScoped<ICadastroRepository, CadastroRepository>();


builder.Services.AddControllersWithViews().AddRazorRuntimeCompilation();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
