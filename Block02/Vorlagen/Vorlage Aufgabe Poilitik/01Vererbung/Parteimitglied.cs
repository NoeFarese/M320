using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Vererbung
{
    public class Parteimitglied
    {
        //Membervariablen
        private string m_Name;
        private string m_Vorname;
        private string m_Partei = null;
        //Konstruktoren
        public Parteimitglied(string Name, string Vorname, string partei) {
            setName(Name);
            setVorname(Vorname);
            setPartei(partei);
        }
        public Parteimitglied(string Name, string Vorname) {
            setName(Name);
            setVorname(Vorname);
        }
        //Methoden
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
        public string getPartei() {
            return m_Partei;
        }
        public void setPartei(string value) {
            m_Partei = value;
        }
        public void Datenausgabe()  {
            Console.Write("Name und Vorname: " + getName() + " " + getVorname());
            Console.WriteLine(", Partei:" + getPartei());
        }
    }
}
