public class PersonDaten {
    private String m_Name;
    private String m_Vorname;

    public PersonDaten(String name, String vorname) {
        this.m_Name = name;
        this.m_Vorname = vorname;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public String getM_Vorname() {
        return m_Vorname;
    }

    public void setM_Vorname(String m_Vorname) {
        this.m_Vorname = m_Vorname;
    }
}
