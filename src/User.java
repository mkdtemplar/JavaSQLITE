/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sagit
 */
class User
{
    private int sno;
    private String name, address, gender, knowledge, subject;

    public User(int sno, String name, String address, String gender, String knowledge, String subject)
    {
        this.sno = sno;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.knowledge = knowledge;
        this.subject = subject;
    }

    public int getSno()
    {
        return sno;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getGender()
    {
        return gender;
    }

    public String getKnowledge()
    {
        return knowledge;
    }

    public String getSubject()
    {
        return subject;
    }
}
