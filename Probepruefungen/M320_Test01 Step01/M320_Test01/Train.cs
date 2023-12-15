using System;

namespace M320_Test01 { 
    public class Train:LandVehicle {
        public Train() : base("not defined", "not defined") {
        }
        public Train(string manufacturer, string productname) : base(manufacturer, productname) {
        }
        public override string getTypeInformation() {
            return "I am a train.";
        }
    }
}
