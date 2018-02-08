package uk.ac.tees.com2060.froyo.db;

import android.arch.persistence.room.*;

@Entity
class User
{
    @PrimaryKey
    public long uid;

    public String accountName;
    public String password;
    public String email;
    public boolean active;
    public String address;
    public String forename;
    public String surname;

}