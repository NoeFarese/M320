using System;
using System.Collections.Generic;

namespace M320_Test01
{
    public class Program {
        static void Main(string[] args) {
            List<Vehicle> vehicles = new List<Vehicle>();
            LandVehicle c1 = new Car("Audi", "RS8", 4);
            vehicles.Add(c1);
            Car c2 = new Car("BMW");
            c2.setProductName("Isetta");
            c2.setNumberOfSeats(2);
            vehicles.Add(c2);
            vehicles.Add(new Car("Hans Glas GmbH", "Goggomobil 400", 4));
            Lorry l1 = new Lorry("Scania", "R770" );
            l1.setLoadingCapacitiy(80000);
            vehicles.Add(l1);
            vehicles.Add(new Lorry("MAN", "TGX 41.640", 250000));
            Train t1 = new Train();
            t1.setProductName("Kiss200");
            vehicles.Add(t1);
            vehicles.Add(new Train("Stadler Rail", "Smile"));
            vehicles.Add(new Ship("Meyer Werft", "Disney Treasure III"));
            vehicles.Add(new Ship());
            foreach (Vehicle v in vehicles) 
                Console.WriteLine( v.Output());
            Console.ReadLine();
        }
    }
}
