using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M320_Test01
{
    public class Car :LandVehicle
    {
        private int _nuOfSeats;
        public Car(string manufacturer, string productname, int nuOfSeats) : base(manufacturer, productname)
        {
            setNumberOfSeats(nuOfSeats);
        }
        public Car(string manufacturer) : base(manufacturer, "not defined")        {
            setNumberOfSeats(1);
        }
        public int getNumberOfSeats() { 
            return _nuOfSeats;
        }
        public void setNumberOfSeats(int nuOfSeats){
            _nuOfSeats = nuOfSeats;
        }

        public override string Output() {
            return base.Output() + " Seats: " + getNumberOfSeats();
        }
        public override string getTypeInformation() {
            return "I am a car.";
        }
    }
}
