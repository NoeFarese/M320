using System;

namespace M320_Test01
{
    public abstract class Vehicle
    {
        private string _manufacturer;
        public Vehicle(string manufacturer) {
            setManufacturer(manufacturer);
        }
        public string getManufacturer() {
            return _manufacturer;
        }
        public void setManufacturer(string value) {
            _manufacturer = value;
        }
        public abstract string Output();
        public virtual string getTypeInformation() {
            return "I am a Vehicle.";
        }
    }
}
