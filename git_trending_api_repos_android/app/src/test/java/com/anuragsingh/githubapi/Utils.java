package com.anuragsingh.githubapi;

import java.util.Collections;
import java.util.List;

import com.anuragsingh.githubapi.data.model.ItemModel;
import com.anuragsingh.githubapi.data.model.LicenseModel;
import com.anuragsingh.githubapi.data.model.OwnerModel;
import com.anuragsingh.githubapi.data.model.RepoModel;

public class Utils {

    public static RepoModel generateRepo(List<ItemModel> items){
        return new RepoModel(1,true, items);
    }

    public static List<ItemModel> generateTestOneItemModel(){
        return Collections.singletonList(new ItemModel("Islem", "http://www.test.com"
                , "http://www.test.com"
                , "Description"
                , "Java"
                , new LicenseModel("GPL")
                , new OwnerModel("islem", "http://www.test.com", "http://www.test.com")
                , 122));
    }

    public static List<ItemModel> generateTestTwoItemModel(){
        return Collections.singletonList(new ItemModel("abdelkader", "http://www.test.com"
                , "http://www.test.com"
                , "Description"
                , "C++"
                , new LicenseModel("GPL")
                , new OwnerModel("abdelkader", "http://www.test.com", "http://www.test.com")
                , 122));
    }


}
