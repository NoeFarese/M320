using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M320_Test01
{ 
    public abstract class LandVehicle: Vehicle
    {
        private string _productname;
        public LandVehicle(string manufacturer, string productname): base(manufacturer) {
            setProductName(productname);
        }
        public string getProductName() {
            return _productname;
        }
        public void setProductName(string value) {
            _productname = value;
        }
        public override string Output() {
            return getTypeInformation() + " Manufacturer:" + getManufacturer() + " ProductName: " + getProductName(); ;
        }
    }
}
