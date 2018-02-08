package uk.ac.tees.com2060.froyo.db;

import android.arch.persistence.room.*;

import java.util.List;

@Dao
public interface ListingDao
{
    @Insert
    public void insertListing(Listing listing);

    @Update
    public void updateListing(Listing listing);

    @Delete
    public void deleteListing(Listing listing);

    @Query("SELECT uid, packageName FROM listing")
    List<Listing> getAllListings();

    
}