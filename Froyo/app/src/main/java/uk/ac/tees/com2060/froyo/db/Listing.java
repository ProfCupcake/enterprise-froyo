package uk.ac.tees.com2060.froyo.db;

import android.arch.persistence.room.*;

@Entity(foreignKeys = @ForeignKey(entity = User.class, parentColumns = "uid", childColumns = "user_id"))
class Listing
{
    @PrimaryKey
    public long uid;

    public String packageName;
    public String address;
    public String destination;
    public String details;
    // public (a date/time format) deliveryTime; TODO
    public int payment;
    public boolean active;
    // TODO: link Courier table
}
