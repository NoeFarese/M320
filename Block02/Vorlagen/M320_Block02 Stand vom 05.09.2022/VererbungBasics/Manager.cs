using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VererbungBasics
{
    public class Manager : Employee
    {
        public Manager():base() {
            Bonus = 50000;
            ZielErreicht = false;
        }
        public Manager(string firstname, string lastame, double salarypermonth, double bonus)
            :base(firstname, lastame, salarypermonth) {
            Bonus = bonus;
        }
        public double Bonus { get; set; }
        public bool ZielErreicht { get; set; }
        new public double SalaryPerYear {
            get { return base.SalaryPerYear + (ZielErreicht? Bonus:Bonus/2); }
        }
    }
}
