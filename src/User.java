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
    private String name;
    private String address;
    private String gender;
    private String knowledge;
    private String subject;
    private byte[] picture;
    private String date;

    public User ( int sno, String name, String address, String gender, String knowledge, String subject, byte[] picture, String date )
    {
        this.sno = sno;
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.knowledge = knowledge;
        this.subject = subject;
        this.picture = picture;
        this.date = date;
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
    
    public byte[] getPicture ()
    {
        
        return picture;
    }
    
    public String getDate ()
    {
        
        return date;
    }
}
