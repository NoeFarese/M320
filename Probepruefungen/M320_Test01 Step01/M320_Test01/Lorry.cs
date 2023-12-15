using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace M320_Test01
{
    public class Lorry:LandVehicle
    {
        private int _loadingCapacitiy;

        public Lorry(string manufacturer, string productname, int maxLoad) : base(manufacturer, productname) {
            setLoadingCapacitiy(maxLoad);
        } 
        public Lorry(string manufacturer, string productname) : base(manufacturer, productname) {
            setLoadingCapacitiy(0);
        }
        public int getLoadingCapacitiy(){
            return _loadingCapacitiy;
        }
        public void setLoadingCapacitiy(int maxLoad){
            _loadingCapacitiy = maxLoad;
        }
        public override string Output() {
            return base.Output() + "MaxLoads: " + getLoadingCapacitiy();
        }
        public override string getTypeInformation()        {
            return "I am a lorry.";
        }
    }
}
