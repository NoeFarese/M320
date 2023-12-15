using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M320_Test01
{
    public class Ship : Vehicle{
        private string _name;
        public Ship() : base("not defined") {
            setName("not defined");
        }
        public Ship(string manufacturer, string name) : base(manufacturer) {
            setName(name);
        }
        public string getName() {
            return _name;
        }
        public void setName(string value) {
            _name = value;
        }
        public override string getTypeInformation(){
            return "I am a ship.";
        }
        public override string Output()        {
            return getTypeInformation() + " Manufacturer:" + getManufacturer() + " Shipname: " + getName(); ;
        }
    }
}
