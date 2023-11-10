using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Vererbung
{
    public class Politiker
    {
        //Membervariablen
        private string m_Name;
        private string m_Vorname;
        private double m_Lohn;
        private string m_Partei = null;
        private string m_Rat = null;
        //Konstruktoren
        public Politiker(string Name, string Vorname, double l, string p, string r) {
            setName(Name);
            setVorname(Vorname);
            setLohn(l);
            setPartei(p);
            setRat(r);
        }
        public Politiker(string Name, string Vorname) {
            setName(Name);
            setVorname(Vorname);
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
        public double getLohn() {
            return m_Lohn;
        }
        public void setLohn(double value) {
            m_Lohn = value;
        }
        public string getPartei() {
            return m_Partei;
        }
        public void setPartei(string value) {
            m_Partei = value;
        }
        public string getRat() {
            return m_Rat;
        }
        public void setRat(string value) {
            m_Rat = value;
        }
        public void Datenausgabe() {
            Console.Write("Name und Vorname: " + getName() + " " + getVorname());
            Console.WriteLine(", Lohn:" + getLohn() + ", Rat: " + getRat());
        }
    }
}
