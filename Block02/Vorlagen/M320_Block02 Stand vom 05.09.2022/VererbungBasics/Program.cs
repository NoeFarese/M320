using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VererbungBasics
{
    public class Program
    {
        static void Main(string[] args)
        {
            Employee e1 = new Employee("Roland", "Bucher", 3000);
            double jl = e1.SalaryPerYear;

            Employee e2 = new Employee();
            double jl2 = e1.SalaryPerYear;

            Manager m1 = new Manager();

            Manager m2 = new Manager("Hugo", "Boss", 10000, 80000);


        }
    }
}
