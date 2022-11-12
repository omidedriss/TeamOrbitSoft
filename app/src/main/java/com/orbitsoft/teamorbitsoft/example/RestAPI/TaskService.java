package com.orbitsoft.teamorbitsoft.example.RestAPI;


import com.google.gson.JsonObject;
import com.orbitsoft.teamorbitsoft.example.Model.GetCategoriesProduct;
import com.orbitsoft.teamorbitsoft.example.Model.RefreshToken;

import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Administrator on 1/26/2018.
 */

public interface TaskService {

//    @FormUrlEncoded
//    @POST("login")
//    Call<LoginResponse> Login(
//            @FieldMap Map<String, String> fields);

    @FormUrlEncoded
    @POST("RefreshToken")
    Call<RefreshToken> RefreshToken(String UserName,String password);
//    @GET("api/MyProtectedApi")
//    Call<UserInfo> MyProtectedApi();
//    @GET("Api/User/GetProvinceByCountryId")
//    Call<List<GetProvinceByCountryId>> GetProvinceByCountryId(@Query("CountryId") int param1);
//    @GET("api/Category/GetDeliveryMethods")
//    Call<List<GetDeliveryMethods>> GetDeliveryMethods();
//    @GET("api/User/GetMyAddresses")
//    Call<List<GetMyAddress>> GetMyAddress();
//    @GET("Api/Category/GetDiscountCategories")
//    Call<List<GetDiscountCategories>> GetDiscountCategories();
//    @GET("api/Shop/GetShopsBySubCategory")
//    Call<List<GetShopsBySubCategory>> GetShopsBySubCategory(@Query("SubCategoryId") int SubCategoryId, @Query("Page") int Page);
//    @GET("api/Shop/GetHomeShops")
//    Call<List<GetShopsBySubCategory>> GetHomeShops(@Query("Page") int Page);
//    @GET("api/Shop/GetInternetShops")
//    Call<List<GetShopsBySubCategory>> GetInternetShops(@Query("Page") int Page);
//
//    @GET("Api/Product/GetProductsBySubCategory")
//    Call<List<GetProductsBySubCategory>> GetProductsBySubCategory(@Query("SubCategoryId") Long SubCategoryId, @Query("Page") int Page, @Query("DiscountCategoryId") int DiscountCategoryId);
//    @GET("Api/Product/SearchProductsByName")
//    Call<List<GetProductsBySubCategory>> SearchProductsByName(@Query("Query") String Query, @Query("Page") int Page, @Query("DiscountCategoryId") int DiscountCategoryId);
//    @GET("Api/Shop/SearchMyShopsByNameForOverView")
//    Call<List<GetMyShopsForOverView>> SearchMyShopsByNameForOverView(@Query("Query") String Query, @Query("Page") int Page);
//    @GET("api/Shop/SearchShopsByName")
//    Call<List<GetShopsBySubCategory>> SearchShopsByName(@Query("Query") String Query, @Query("Page") int Page);
//    @GET("api/Product/SearchMyProductsByNameForOverView")
//    Call<List<GetMyProductsForOverView>> SearchMyProductsByNameForOverView(@Query("Query") String Query, @Query("Page") int Page, @Query("ShopId") long ShopId);
//    @GET("api/Order/SearchMyDeliveredOrdersByNameAndDate")
//    Call<List<GetMyOrdersNew>> SearchMyDeliveredOrdersByNameAndDate(@Query("Query") String Query, @Query("Date1") String Date1, @Query("Date2") String Date2, @Query("Page") int Page);
//
//
//
//    @GET("Api/User/GetCityByProvinceId")
//    Call<List<GetCityByProvinceId>> GetCityByProvinceId(@Query("ProvinceId") int ProvinceId);
//
//    @GET("Api/Product/GetMyProductsForOverView")
//    Call<List<GetMyProductsForOverView>> GetMyProductsForOverView(@Query("ShopId") long ShopId, @Query("Page") int Page);
//
//    @GET("Api/Shop/GetMyShopsForOverView")
//    Call<List<GetMyShopsForOverView>> GetMyShopsForOverView();
//
//    @GET("Api/Product/GetProductById")
//    Call<GetProductById> GetProductById(@Query("ProductId") long ProductId);
//
//    @GET("api/Shop/RemoveShop")
//    Call<RemoveShop> RemoveShop(@Query("ShopId") long ShopId);
//
//    @GET("api/Shop/HideShop")
//    Call<RemoveShop> HideShop(@Query("ShopId") long ShopId);
//    @GET("api/Shop/UnhideShop")
//    Call<RemoveShop> UnhideShop(@Query("ShopId") long ShopId);
//
//
//    @GET("Api/User/GetTownByCityId")
//    Call<List<GetTownByCityId>> GetTownByCityId(@Query("CityId") int CityId);
//    @GET("Api/User/GetVillageByTownId")
//    Call<List<GetVillageByTownId>> GetVillageByTownId(@Query("TownId") String param1);
//
//    @GET("Api/User/GetUserNameFromRegistryOffice")
//    Call<GetUserNameFromRegistryOffice> GetUserNameFromRegistryOffice(@Query("NationalCode") String param1);
//
//    @GET("Api/User/GetRulesUrl")
//    Call<String> GetRulesUrl();
//
//    @GET("Api/Identification/IsUserNewByMobileNumber")
//    Call<IsUserNewByMobileNumber> IsUserNewByMobileNumber(@Query("MobileNumber") String param1, @Query("Username") String Username);
//    @GET("Api/Identification/IsValidUserName")
//    Call<IsUserNewByMobileNumber> IsValidUserName(@Query("MobileNumber") String param1, @Query("Username") String Username);
//
//    @GET("Api/MainUI/GetSlideShowImages")
//    Call<List<GetSlideShowImages>> GetSlideShowImages(@Query("ImageSlideShowTypeId") int ImageSlideShowTypeId);
//
//    @POST("api/Identification/SendVerificationSms")
//    Call<SendVerificationSms> SendVerificationSms(@Query("MobileNumber") String MobileNumber, @Query("Username") String Username);
//
//    @GET("api/Identification/CheckVerificationCode")
//    Call<CheckVerificationCode> CheckVerificationCode(@Query("MobileNumber") String MobileNumber, @Query("Code") int Code);
//
//    @GET("Api/Category/GetCategories")
//    Call<List<GetCategories>> GetCategories(@Query("ShopTypeId") int ShopTypeId);
//
    @GET("api/Product/GetCategories")
    Call<List<GetCategoriesProduct>> GetCategoriesProduct();
//
//    ////////////////////////////////// new api
//
//    @POST("/fa-IR/MenuManagementDefault/GetMenuForCtrl/")
//    Call<List<GetCategories>> GetCategories(@Body Map<String, String> params);
//    @POST("/SlideShowManagementDefault/GetSlideShowItemsForCtrl/")
//    Call<List<GetSlideShowItemsForCtrl>> GetSlideShowItemsForCtrl(@Body Map<String, String> params);
//    @POST("/fa-IR/ItemsManagementDefault/GetCatalogImages/")
//    Call<List<GetSlideShowItemsForCtrl>> GetCatalogImages(@Query("id") long id);
//
//    @POST("MediaShowDefault/GetMediaShowForCtrl/")
//    Call<GetMediaShow> GetMediaShowForCtrl(@Body Map<String, String> params);
//    @POST("/fa-IR/AmazingOfferDefault/GetDiscountedOffterForCtrl/")
//    Call<GetDiscountedOffterForCtrlItems> GetDiscountedOffterForCtrl(@Query("itemsCount") int itemsCount);
//    @POST("/fa-IR/ItemsCarouselManagementDefault/GetItemsCarouselForCtrl/")
//    Call<GetDiscountedOffterForCtrlItems> GetItemsCarouselForCtrl(@Body Map<String, String> params);
//    @POST("/fa-IR/AmazingOfferDefault/GetAmazingOffterForCtrl/")
//    Call<GetDiscountedOffterForCtrlItems> GetAmazingOffterForCtrl();
//    @POST("/fa-IR/ItemsManagementDefault/SearchItems/")
//    Call<GetDiscountedOffterForCtrlItems> SearchItems(@Body JsonObject param);
//    @POST("/fa-IR/ItemsManagementDefault/GetItemInformationByItemID/")
//    Call<GetItemInformationByItemID> GetItemInformationByItemID(@Query("id") long id);
//
//////////////////////// end new api
//
//    @GET("api/Product/GetSubCategories")
//    Call<List<GetCategoriesProduct>> GetSubCategoriesProduct(@Query("ProductCategoryId") int ProductCategoryId);
//
//    @GET("api/Faq/GetFaq")
//    Call<List<GetFaq>> GetFaq();
//    @GET("api/Faq/GetSubFaq")
//    Call<List<GetFaq>> GetSubFaq(@Query("FAQid") int FAQid);
//    @GET("api/User/AskQuestion")
//    Call<CreateShop> AskQuestion(@Query("Subject") String Subject);
//    @GET("api/User/GetAvailableCards")
//    Call<List<GetAvailableCards>> GetAvailableCards();
//
//    @GET("api/User/GetScoreInformation")
//    Call<List<GetScoreInformation>> GetScoreInformation();
//    @GET("api/User/GetKLScoreDetail")
//    Call<List<GetScoresDetail>> GetKLScoreDetail(@Query("CardId") int CardId);
//    @GET("api/User/GetKDScoresDetail")
//    Call<List<GetScoresDetail>> GetKDScoresDetail(@Query("CardId") int CardId);
//    @GET("api/User/GetKGScoreDetail")
//    Call<List<GetScoresDetail>> GetKGScoreDetail(@Query("CardId") int CardId);
//    @GET("api/User/GetMyDirectScoreList")
//    Call<List<GetMyDirectScoreList>> GetMyDirectScoreList();
//
//    @GET("api/Category/GetSubCategories")
//    Call<List<GetCategories>> GetSubCategories(@Query("ShopCategoryId") int ShopCategoryId);
//    @GET("api/User/GetFriends")
//    Call<List<GetFriends>> GetFriends(@Query("UserId") long UserId);
//
//    @GET("Api/Options/GetMemberKartakMenu")
//    Call<List<GetMemberKartakMenu>> GetMemberKartakMenu();
//
//    @GET("Api/Options/GetMyPersonMenu")
//    Call<List<GetMyPersonMenu>> GetMyPersonMenu();
//
//    @GET("api/Options/GetAllMenus")
//    Call<GetAllMenus> GetAllMenus();
//    @GET("api/MainUI/GetMainUI")
//    Call<List<GetMyPersonMenu>> GetItem();
//
//    @GET("Api/Options/GetGameItemMenu")
//    Call<List<GetMyPersonMenu>> GetGameItemMenu();
//    @GET("Api/Options/GetLibraryItemMenu")
//    Call<List<GetMyPersonMenu>> GetLibraryItemMenu();
//    @GET("Api/Options/GetNewsItemMenu")
//    Call<List<GetMyPersonMenu>> GetNewsItemMenu();
//    @GET("Api/Options/GetMediaItemMenu")
//    Call<List<GetMyPersonMenu>> GetMediaItemMenu();
//    @GET("Api/Options/GetFestivalItemMenu")
//    Call<List<GetMyPersonMenu>> GetFestivalItemMenu();
//    @GET("Api/Options/GetExhibitionItemMenu")
//    Call<List<GetMyPersonMenu>> GetExhibitionItemMenu();
//
//    @GET("Api/Options/GetTourismItemMenu")
//    Call<List<GetMyPersonMenu>> GetTourismItemMenu();
//    @GET("Api/Options/GetInternetItemMenu")
//    Call<List<GetMyPersonMenu>> GetInternetItemMenu();
//    @GET("Api/Options/GetBuyCardMenu")
//    Call<List<GetMyPersonMenu>> GetBuyCardMenu();
//    @GET("Api/Options/GetKartakItemMenu")
//    Call<List<GetMyPersonMenu>> GetKartakItemMenu();
//
//
//    @GET("Api/Options/GetChildItemMenu")
//    Call<List<GetMyPersonMenu>> GetChildItemMenu();
//
//    public interface MyBackendAPI {
//
//    }
//
//    @GET("Api/Options/GetMyShopItemMenu")
//    Call<List<GetMyPersonMenu>> GetMyShopItemMenu();
//
//    @GET("api/Options/GetImageItemMenu")
//    Call<List<GetImageItemMenu>> GetImageItemMenu();
//
//    @GET("api/Shop/GetShopsByDateOrder")
//    Call<List<GetShopsByDateOrder>> GetShopsByDateOrder();
//
//    @GET("api/Shop/GetSimilarShops")
//    Call<List<GetShopsByDateOrder>> GetSimilarShops(@Query("ShopId") long ShopId, @Query("Page") int Page);
//
//    @GET("api/Shop/GetShopByIdForReview")
//    Call<GetShopByIdForReview> GetShopByIdForReview(@Query("ShopId") long ShopId);
//
//    @GET("api/Shop/GetShopsByKartakSuggestion")
//    Call<List<GetShopsByKartakSuggestion>> GetShopsByKartakSuggestion(@Query("PageNumber") int PageNumber);
//
//    @GET("api/Product/GetProductsByKartakSuggestion")
//    Call<List<GetProductsByKartakSuggestion>> GetProductsByKartakSuggestion(@Query("ShopTypeId") long ShopTypeId);
//    @GET("api/Product/GetProductsByOrderCount")
//    Call<List<GetProductsByKartakSuggestion>> GetProductsByOrderCount();
//
//    @GET("api/Product/GetProductsByShopId")
//    Call<List<GetProductsBySubCategory>> GetProductsByShopId(@Query("ShopId") long ShopId, @Query("Page") int Page);
//
//    @GET("api/MainUI/GetMainUIDiscountCategory")
//    Call<List<GetMainUIDiscountCategory>> GetMainUIDiscountCategory(@Query("ShopTypeId") int ShopTypeId);
//    @GET("api/MainUI/GetKartakFamilyInformation")
//    Call<GetKartakFamilyInformation> GetKartakFamilyInformation();
//    @GET("api/Shop/GetMyShopStats")
//    Call<GetMyShopStats> GetMyShopStats();
//
//    @GET("api/Shop/GetShopByIdForEdit")
//    Call<GetShopByIdForEdit> GetShopByIdForEdit(@Query("ShopId") long ShopId);
//
//    @GET("api/Category/GetShopTypes")
//    Call<List<GetShopTypes>> GetShopTypes();
//    @GET("api/Shop/GetAuthorizedShopTypes")
//    Call<List<GetAuthorizedShopTypes>> GetAuthorizedShopTypes();
//
//    @GET("api/Category/GetShopCategories")
//    Call<List<GetShopCategories>> GetShopCategories();
//
//    @GET("api/Category/GetCourrierTypes")
//    Call<List<GetCourrierTypes>> GetCourrierTypes();
//
//    @GET("api/User/GetMyKartakBills")
//    Call<List<GetMyKartakBills>> GetMyKartakBills();
//    @GET("api/User/GetMyCreditBills")
//    Call<List<GetMyKartakBills>> GetMyCreditBills();
//
//    @GET("api/Order/GetMyOrdersNew")
//    Call<List<GetMyOrdersNew>> GetMyOrdersNew(@Query("Page") int Page);
//
//    @GET("api/Order/GetMyOrdersDelivered")
//    Call<List<GetMyOrdersNew>> GetMyOrdersDelivered(@Query("Page") int Page);
//
//    @GET("api/User/GetUserInformation")
//    Call<GetUserInformation> GetUserInformation();
//    @GET("api/User/GetUserProfile")
//    Call<GetUserProfile> GetUserProfile();
//    @GET("api/User/GetAccountInformation")
//    Call<GetUserProfile> GetAccountInformation();
//
//    @GET("api/User/GetUserNetworkInformation")
//    Call<List<GetUserNetworkInformation>> GetUserNetworkInformation();
//    @GET("api/User/GetSurveyList")
//    Call<List<GetSurveyList>> GetSurveyList();
//    @GET("api/User/GetSurveyItems")
//    Call<List<GetSurveyItems>> GetSurveyItems(@Query("SurveyId") long Page);
//    @GET("api/User/GetSurveyCounter")
//    Call<List<GetSurveyCounter>> GetSurveyCounter(@Query("SurveyId") long SurveyId);
//    @GET("api/Survey/Voting")
//    Call<CreateShop> Voting(@Query("SurveyId") long SurveyId, @Query("SurveyItemId") long SurveyItemId);
//
//    @GET("api/Order/GetCurrentBasketItems")
//    Call<List<GetCurrentBasketItems>> GetCurrentBasketItems();
//
//    @GET("api/Product/GetProductPriceHistory")
//    Call<List<GetProductPriceHistory>> GetProductPriceHistory(@Query("ProductId") long ProductId);
//    @GET("api/Product/LikeProduct")
//    Call<CreateShop> LikeProduct(@Query("ProductId") long ProductId);
//
//    @GET("api/Order/CalculateBasketPrice")
//    Call<CalculateBasketPrice> CalculateBasketPrice();
//
//
//    @POST("api/Product/CreateProduct")
//    Call<CreateProduct> CreateProduct(@Body Map<String, String> params);
//    @POST("api/Product/UpdateProduct")
//    Call<CreateProduct> UpdateProduct(@Body Map<String, String> params);
//
//    @POST("api/User/RegisterUser")
//    Call<RegisterUser> RegisterUser(@Body Map<String, String> params);
//
//    @POST("api/User/UpdateProfile")
//    Call<RegisterUser> UpdateProfile(@Body Map<String, String> params);
//
//    @POST("api/Identification/AuthenticatePreRegister")
//    Call<AuthenticatePreRegister> AuthenticatePreRegister(@Query("Username") String Username, @Query("MobileNumber") String MobileNumber, @Query("Password") int Password);
//
//    @POST("api/Shop/CreateShop")
//    Call<CreateShop> CreateShop(@Body Map<String, String> params);
//    @GET("api/Order/RemoveOrderFromBasket")
//    Call<CreateShop> RemoveOrderFromBasket(@Query("ProductId") long ProductId);
//    @POST("api/Order/SubmitBasket")
//    Call<SubmitBasket> SubmitBasket(@Query("Address") String Address, @Query("ReceiverName") String ReceiverName, @Query("ReceiverMobileNumber") String ReceiverMobileNumber, @Query("ReceiveTime") String ReceiveTime, @Query("PostalCode") String PostalCode, @Query("DeliveryMethodId") int DeliveryMethodId);
//
//
//
//    @POST("api/Shop/UpdateShop")
//    Call<CreateShop> UpdateShop(@Body Map<String, String> params);
//    @POST("api/Account/ChargeWalletRequest")
//    Call<ChargeWalletRequest> ChargeWalletRequest(@Query("Payment") int Payment, @Query("GateWayId") int GateWayId);
//    @POST("api/Account/ChargeAccountRequest")
//    Call<ChargeAccountRequest> ChargeAccountRequest(@Query("CardId") int CardId, @Query("Count") int Count, @Query("PresenterId") long PresenterId);
//
//
//
//    @POST("api/Order/AddOrderToBasket")
//    Call<AddOrderToBasket> AddOrderToBasket(@Query("ProductId") long ProductId, @Query("Count") int Count);
//


//    @POST("api/User/RegisterUser")
//    Call<RegisterUser> RegisterUser(@Field("userName") String userName,@Field("registerDeviceTypeId") String registerDeviceTypeId,@Field("firstName") String firstName,@Field("lastName") String lastName,@Field("nationalCode") String nationalCode,@Field("genderId") String genderId,@Field("mobileNumber") String mobileNumber,@Field("countryId") String countryId,@Field("provinceId") String provinceId,@Field("cityId") String cityId,@Field("townId") String townId,@Field("villageId") String villageId);


//    Call<UserInfo> MyProtectedApi(@QueryMap Map<String, String> params);

}
