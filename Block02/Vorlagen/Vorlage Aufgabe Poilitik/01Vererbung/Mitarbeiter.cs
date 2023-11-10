using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Vererbung
{
    public class Mitarbeiter
    {
        //Membervariablen
        private string m_Name;
        private string m_Vorname;
        private double m_Lohn;
        private string m_Firma;
        //Konstruktoren
        public Mitarbeiter(string Name, string Vorname) {
            setName(Name);
            setVorname(Vorname);
        }
        public Mitarbeiter(string Name, string Vorname, double Lohn, string firma) {
            setName(Name);
            setVorname(Vorname);
            setLohn(Lohn);
            setFirma(firma);
        }
        public string getName() {
            return m_Name;
        }
        public void setName(string value) {
            m_Name = value;
        }
        public string getVorname()  {
            return m_Vorname;
        }
        public void setVorname(string value) {
            m_Vorname = value;
        }
        public double getLohn()  {
            return m_Lohn;
        }
        public void setLohn(double value) {
            m_Lohn = value;
        }
        public string getFirma() {
            return m_Firma;
        }
        public void setFirma(string value) {
            m_Firma = value;
        }
        public void Datenausgabe()
        {
            Console.Write("Name und Vorname: " + getName() + ", " + getVorname());
            Console.WriteLine(" Lohn:" +getLohn()+ ", Firma:" +getFirma());
        }
    }
}
