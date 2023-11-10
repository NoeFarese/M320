using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VererbungBasics
{
    public class Employee 
    {
        public Employee() {
            FirstName = "";
            LastName = "";
            SalaryPerMonth = 1000;
        }
        public Employee(string firstname, string lastame, double salarypermonth) {
            FirstName = firstname;
            LastName = lastame;
            SalaryPerMonth = salarypermonth;
        }
        private int _parttimerate = 0;
        public int Personalnumber { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public double SalaryPerMonth { get; set; }
        public int PartTimeRate {
            get { return _parttimerate; }
            set {
                if (value < 10)
                    value = 10; 
                else if (value > 100)
                    value = 100;
                _parttimerate = value;
            }
        }
        public double SalaryPerYear {
            get {return 13* SalaryPerMonth; } 
        }
    }
}
