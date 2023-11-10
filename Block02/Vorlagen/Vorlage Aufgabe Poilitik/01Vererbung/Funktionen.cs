using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Vererbung
{
    public class Funktionen
    {
        public static void Lohnerhoehung(Mitarbeiter m, double d)
        {
            double dAlterLohn = m.getLohn();
            double dNeuerLohn = dAlterLohn/100*(100+d);
            m.setLohn(dNeuerLohn);
        }

        public static void Lohnerhoehung(Politiker p, double d)
        {
            double dAlterLohn = p.getLohn();
            double dNeuerLohn = dAlterLohn / 100 * (100 + d);
            p.setLohn(dNeuerLohn);
        }

    }
}
