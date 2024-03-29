package com.checkAuto.appium.screens.nativeapp.makemytrip;

import org.openqa.jetty.http.SSORealm;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.w3c.dom.css.Rect;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import com.checkAuto.appium.base.Constants;
import com.checkAuto.appium.base.ScreenBase;

public class CopyOfGenerate_orders extends ScreenBase {
	
	
	@AndroidFindBy(uiAutomator  = Constants.LOGIN_BUTTON)
	public WebElement login_button;//登陆按钮
	
	@AndroidFindBy(uiAutomator  = Constants.NEW_ADD_DETECTION)
	public WebElement new_add_detection;
	
	@AndroidFindBy(xpath  = Constants.INDEX1)
	public WebElement index1;
	
	@AndroidFindBy(xpath  = Constants.CHOOSE_CONFIRM)
	public WebElement choose_confirm;
	

	@AndroidFindBy(xpath  = Constants.BASE_INFO)
	public WebElement baseinformation;
	
	
	@AndroidFindBy(uiAutomator  = Constants.LICENSE_PLATE_NUMBER)
	public WebElement license_plate_number;
	
	@AndroidFindBy(uiAutomator  = Constants.VEHICLE_TYPE)
	public WebElement vehicle_type;
	
	
	
	
	
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.EDIT_SEARCH)
	public WebElement edit_search;
	
	@AndroidFindBy(uiAutomator  = Constants.SEARCH_BUTTON)
	public WebElement search_button;
	
	
	@AndroidFindBy(xpath  = Constants.SEARCH_INDEX1)
	public WebElement search_index1;
	
	
	
	
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.BASIC_INFO)
	public WebElement basic_info;
	
	@AndroidFindBy(uiAutomator  = Constants.CAR_NUM_AREA_LIST)
	public WebElement car_num_area_list;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.CAR_NUM_AREA_LIST_INDEX)
	public WebElement car_num_area_list_index;
	
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.CAR_TYPE_INPUT)
	public WebElement car_type_input;
	
	
	@AndroidFindBy(xpath  = Constants.CAR_TYPE_INDEX1)
	public WebElement car_type_index1;
	
	
	//公户
	@AndroidFindBy(uiAutomator  = Constants.CAR_PUBLISER_)
	public WebElement car_publiser_;
	
	//私户
	
	@AndroidFindBy(uiAutomator  = Constants.CAR_OWNER)
	public WebElement car_owner;
	
	
	 //一手
	@AndroidFindBy(uiAutomator  = Constants.FIRSTHAND_Y)
	public WebElement firsthand_y;
	
	 //二手
	@AndroidFindBy(uiAutomator  = Constants.FIRSTHAND_N)
	public WebElement firsthand_n;
	
	
	//请选择原始购车发票
	@AndroidFindBy(uiAutomator  = Constants.ORIGINAL_CAR_INVOICE)
	public WebElement original_car_invoice;
	
	
	//现在  购车发票的列表  有 丢失 有发票未验证
	
	@AndroidFindBy(xpath  = Constants.ORIGINAL_CAR_INVOICE_INDEX1)
	public WebElement original_car_invoice_index1;
	
	//过户票
	@AndroidFindBy(uiAutomator  = Constants.TRANSFER_USER_Y)
	public WebElement transfer_user_y;
	
	
	@AndroidFindBy(uiAutomator  = Constants.TRANSFER_USER_N)
	public WebElement transfer_user_n;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.TRANSFER_DATE)
	public WebElement transfer_date;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.TRANSFER_TIMES_INPUT)
	public WebElement transfer_times_input;
	
	
	@AndroidFindBy(xpath  = Constants.TRANSFER_TIMES)
	public WebElement transfer_times;
	
	
	
	
	
	//原始购车价
	@AndroidFindBy(uiAutomator  = Constants.ORIGINAL_PRICE)
	public WebElement original_price;
	
	
	//使用性质
	@AndroidFindBy(uiAutomator  = Constants.USING_NATURE_)
	public WebElement using_nature_;
	
	
	//非营运  营运 营转非  租赁  租赁公司非营运 2
	@AndroidFindBy(xpath  = Constants.USING_NATURE_INDEX)
	public WebElement using_nature_index;
	
	
	//VIN  
	@AndroidFindBy(uiAutomator  = Constants.VIN_CODE_)
	public WebElement vin_code_;
	
	
	////请选择车型车系 
	@AndroidFindBy(uiAutomator  = Constants.MODELS_CARS)
	public WebElement models_cars;
	
	//选择品牌车系
	@AndroidFindBy(uiAutomator  = Constants.MODELS_CARS_1)
	public WebElement models_cars_1;
	
	
	@AndroidFindBy(uiAutomator  = Constants.MODELS_CARS_1_2)
	public WebElement models_cars_1_2;
	
	
	@AndroidFindBy(xpath  = Constants.MODELS_CARS_1_2_3)
	public WebElement models_cars_1_2_3;
	
	
	
	//国标码
	@AndroidFindBy(uiAutomator  = Constants.GUOBIAO_NUM)
	public WebElement guobiao_num;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.PRODUCTION_DATE)
	public WebElement production_date;
	
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.ENGINE_NUM)
	public WebElement engine_num;
	
	@AndroidFindBy(uiAutomator  = Constants.REGISTER_DATE)
	public WebElement register_date;
	
	@AndroidFindBy(uiAutomator  = Constants.CONFIRM_YES)
	public WebElement confirm_yes;
	
	
	
	//交强险
	@AndroidFindBy(uiAutomator  = Constants.JIAOQIANGXIAN_Y)
	public WebElement jiaoqiangxian_y;
	
	
	@AndroidFindBy(uiAutomator  = Constants.JIAOQIANGXIAN_N)
	public WebElement jiaoqiangxian_n;
	
	
	
	//交强险到期日
	@AndroidFindBy(uiAutomator  = Constants.ASSURANCE_DATE)
	public WebElement assurance_date;
	
	//商业险
	@AndroidFindBy(uiAutomator  = Constants.COMMERCIAL_INSURANCE_Y)
	public WebElement commercial_insurance_y;
	
	
	//商业险 无
	@AndroidFindBy(uiAutomator  = Constants.COMMERCIAL_INSURANCE_N)
	public WebElement commercial_insurance_n;
	
	//商业险到期日期
	@AndroidFindBy(uiAutomator  = Constants.COMMERCIAL_INSURANCE_EXPIRE_DATE)
	public WebElement commercial_insurance_expire_date;
	
	
	//商业险 金额
	@AndroidFindBy(uiAutomator  = Constants.COMMERCIAL_INSURANCE_PRICE)
	public WebElement commercial_insurance_price;
	
	
	//年检
	@AndroidFindBy(uiAutomator  = Constants.NIANJIAN_Y)
	public WebElement nianjian_y;
	
	
	@AndroidFindBy(uiAutomator  = Constants.NIANJIAN_N)
	public WebElement nianjian_n;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.NIANJIAN_EXPIRE)
	public WebElement nianjian_expire;
	
	
	//车船税
	@AndroidFindBy(uiAutomator  = Constants.TRAVEL_TAX_Y)
	public WebElement travel_tax_y;
	
	@AndroidFindBy(uiAutomator  = Constants.TRAVEL_TAX_N)
	public WebElement travel_tax_n;
	
	//库存地
	@AndroidFindBy(uiAutomator  = Constants.CAR_INVENTORY_INPUT)
	public WebElement car_inventory_input;
	
	
	//省
	@AndroidFindBy(uiAutomator  = Constants.CAR_INVENTORY_PROVINCE_INDEX)
	public WebElement car_inventory_province_index;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.CAR_INVENTORY_PROVINCE)
	public WebElement car_inventory_province;
	
	
	//市
	@AndroidFindBy(uiAutomator  = Constants.CAR_INVENTORY_CITY)
	public WebElement car_inventory_city;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.CAR_INVENTORY_CITY_INDEX)
	public WebElement car_inventory_city_index;
	
	
	
	
	
	//车身颜色
	
	@AndroidFindBy(uiAutomator  = Constants.CHOOSE_CAR_COLOR)
	public WebElement choose_car_color;
	
	//选择项  白色
	@AndroidFindBy(xpath  = Constants.CHOOSE_WHITE_COLOR)
	public WebElement choose_white_color;
	
	//燃油类型
	
	@AndroidFindBy(uiAutomator  = Constants.FUEL_TYPE)
	public WebElement fuel_type;
	
	
	//选择项  电动 相对布局 android.widget.RelativeLayout需要是到List   CHOOSE_ELECTRIC
	@AndroidFindBy(xpath  = Constants.CHOOSE_ELECTRIC)
	public WebElement choose_electric;
	
	
	//排气量1com.youxinpai.checkauto.act:id/sp_l
	
	@AndroidFindBy(uiAutomator  = Constants.DISPLACEMENT1)
	public WebElement displacement1;
	
	@AndroidFindBy(uiAutomator  = Constants.DISPLACEMENT1_INDEX)
	public WebElement displacement1_index;
	
	  //排气量
	@AndroidFindBy(uiAutomator  = Constants.DISPLACEMENT2)
	public WebElement displacement2;
	
	@AndroidFindBy(uiAutomator  = Constants.DISPLACEMENT2_INDEX)
	public WebElement displacement2_index;
	
 	//车钥匙CAR_KEY
	@AndroidFindBy(uiAutomator  = Constants.CAR_KEY)
	public WebElement car_key;
	
	@AndroidFindBy(xpath  = Constants.CAR_KEY_2)
	public WebElement car_key_2;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.SAVE_INFO)
	public WebElement save_info;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.CREDENTIALS_SHOOT)
	public WebElement credentials_shoot;
	
	
	
	@AndroidFindBy(xpath  = Constants.PICTURES_LIST1)
	public WebElement pictures_list1;
	
	
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.RIGHT_NEXT_ARROW)
	public WebElement right_next_arrow;
	
	@AndroidFindBy(uiAutomator  = Constants.LEFT_NEXT_ARROW)
	public WebElement left_next_arrow;
	
	
	@AndroidFindBy(uiAutomator  = Constants.ALL_CREDENTIALS)
	public WebElement all_credentials;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.EXIT_TAKE)
	public WebElement exit_take;
	
	@AndroidFindBy(uiAutomator  = Constants.EXIT_YES)
	public WebElement exit_yes;
	
	
	@AndroidFindBy(uiAutomator  = Constants.ADD_COVER)
	public WebElement add_cover;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.REMOVE_COVER)
	public WebElement remove_cover;
	
	@AndroidFindBy(uiAutomator  = Constants.RETAKE)
	public WebElement retake;
	
	
	@AndroidFindBy(uiAutomator  = Constants.SAVE_PICTURE)
	public WebElement save_picture;
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AndroidFindBy(xpath  = Constants.CHOOSE_VEHICLE_TYPE)
	public WebElement choose_vehicle_type;
	
	@AndroidFindBy(xpath  = Constants.HOLDER)
	public WebElement holder;
	
	
	@AndroidFindBy(xpath  = Constants.USE_PROPERTIES)
	public WebElement use_properties;
	
	
	@AndroidFindBy(xpath  = Constants.OPERATIONS)
	public WebElement operations;
	
	
	@AndroidFindBy(xpath  = Constants.VIN)
	public WebElement vin;
	
	@AndroidFindBy(xpath  = Constants.CHOOSE_CAR_MODEL)
	public WebElement choose_car_model;
	
	
	
	
	
	
	@AndroidFindBys({
		@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/lv_carbrand\")"),
		@AndroidFindBy(className = "android.widget.ListView")
		})
	public WebElement chainElementView;
	
	//com.youxinpai.checkauto.act:id/text  com.youxinpai.checkauto.act:id/lv_carbrand
	@AndroidFindBy(uiAutomator  = Constants.TOP_TEXT)
	public WebElement top_text;
	
	
	@AndroidFindBy(uiAutomator  = Constants.SELECT_VEHICLE_BRAND)
	public WebElement select_vehicle_brand;
	
	
	@AndroidFindBy(uiAutomator  = Constants.SELECT_CAR_SERIES)
	public WebElement select_car_series;
	
	
	@AndroidFindBy(xpath  = Constants.SELECT_CAR_TYPE)
	public WebElement select_car_type;
	
	
	@AndroidFindBy(xpath  = Constants.VEHICLE_BRAND)
	public WebElement vehicle_brand;
	
	
	
	@AndroidFindBy(xpath  = Constants.COLLECTION_TYPE)
	public WebElement collection_type;
	
	
	@AndroidFindBy(xpath = Constants.GUOBIAO_NO)
	
	public WebElement guobiao_no;
	
	
   @AndroidFindBy(xpath = Constants.GUOBIAO_NO_NAME)
	
	public WebElement guobiao_no_name;
	
	
    
	
	
	@AndroidFindBy(uiAutomator  = Constants.ENGINE_NO)
	public WebElement engine_no;
	
	
	@AndroidFindBy(xpath  = Constants.PREVENT_VKB_EXCEPTION)
	public WebElement prevent_VKB_exception;
	
	//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[10]/android.widget.Button[1]
	@AndroidFindBy(xpath  = Constants.SCROLL_TO_DATESCREEN)
	public WebElement scroll_to_datescreen;
	
	
	@AndroidFindBy(xpath  = Constants.CONFIRM_CURRENT_DATE)
	public WebElement confirm_current_date;
	
	//交强险到期日期
	@AndroidFindBy(uiAutomator  = Constants.FOASSURANCE)
	public WebElement forassurance;
	
	//库存地
	@AndroidFindBy(uiAutomator  = Constants.INVENTORY)
	public WebElement inventory;
	
	@AndroidFindBy(xpath  = Constants.CHOOSE_INVENTORY)
	public WebElement choose_inventory;
	
	@AndroidFindBy(xpath  = Constants.CHOOSE_BEIJING)
	public WebElement choose_beijing;
	
	@AndroidFindBy(xpath  = Constants.CONFIRM_INVENTORY)
	public WebElement confirm_inventory;
	
	
	

	
	
	
	@AndroidFindBy(xpath  = Constants.CHOOSE_ELECTRIC)
	public WebElement choose_electri;
	
	
	
//	@AndroidFindBy(xpath  = Constants.SAVE_INFO)
	
	
	//证件拍照
	@AndroidFindBy(xpath  = Constants.CREDENTIALS_TAKE_PICTURE)
	public WebElement credentials_take_picture;
	
	//
	@AndroidFindBy(xpath  = Constants.FRONT_SHOOT)
	public WebElement front_shoot;
	
	@AndroidFindBy(xpath  = Constants.CLICK_SHOOT)
	public WebElement click_shoot;
	

	
	@AndroidFindBy(xpath  = Constants.YES)
	public WebElement yes;
	
	@AndroidFindBy(uiAutomator  = Constants.REG_CERTIFICATE)
	public WebElement reg_certificate;
	
	
	@AndroidFindBy(xpath  = Constants.EXIT_SHOOT)
	public WebElement exit_shoot;
	
	@AndroidFindBy(xpath  = Constants.EXIT_SHOOT_YES)
	public WebElement exit_shoot_yes;
	
	
	
	@AndroidFindBy(uiAutomator  = Constants.NO_EXCEPTION)
	public WebElement no_exception;
	
	
	@AndroidFindBy(uiAutomator  =Constants.HEAD_BACK)
	public WebElement head_back;
	
	
	@AndroidFindBy(uiAutomator  =Constants.CAR_FRONT)
	public WebElement car_front;
	
	@AndroidFindBy(uiAutomator  =Constants.TAKE_PHOTO_START)
	public WebElement take_photo_start;
	
	
	@AndroidFindBy(uiAutomator  =Constants.CAR_FRONT_)
	public WebElement car_front_;
	
	
	@AndroidFindBy(uiAutomator  =Constants.ABNORMAL_YES)
	public WebElement abnormal_yes;
	
	@AndroidFindBy(uiAutomator  =Constants.TAKE_PHOTO)
	public WebElement take_photo;
	
	
	@AndroidFindBy(xpath  =Constants.SAVE_PHOTO)
	public WebElement save_photo;
	
	@AndroidFindBy(uiAutomator  =Constants.NEXT_PAGE)
	public WebElement next_page;
	
	@AndroidFindBy(xpath  =Constants.ENGINE_17_18_SAVETONEXT)
	public WebElement engine_17_18_savetonext;
	
	
	
	@AndroidFindBy(uiAutomator  =Constants.CLICK_CAMERA)
	public WebElement click_camera;
	
	@AndroidFindBy(uiAutomator  =Constants.ADD_FLAW)
	public WebElement add_flaw;
	
	
	@AndroidFindBy(xpath  =Constants.FIRST_ROW_COLUMN)
	public WebElement first_row_column;
	
	@AndroidFindBy(uiAutomator  =Constants.SAVE_FLAW)
	public WebElement save_flaw;
	
	
	@AndroidFindBy(uiAutomator  =Constants.RIGHT_INCREASE_BUTTON)
	public WebElement right_increase_button;
	
	@AndroidFindBy(uiAutomator  =Constants.PLUS_MIDDLE_BUTTON)
	public WebElement plus_middle_button;
	
	@AndroidFindBy(uiAutomator  =Constants.PLUS_THIRD_BUTTON)
	public WebElement plus_third_button;
	
//	
//	@AndroidFindBy(uiAutomator  =Constants.CAR_FRONT)
//	public WebElement car_front;
	@AndroidFindBy(uiAutomator  =Constants.ADD_CONFIGURATION)
	public WebElement add_configuration;
	

	@AndroidFindBy(uiAutomator  =Constants.ENG_OIL_YES)
	public WebElement eng_oil_yes;
	
	@AndroidFindBy(uiAutomator  =Constants.LIQUED_YES)
	public WebElement liqued_yes;
	
	@AndroidFindBy(uiAutomator  =Constants.BRAKE_OIL_EXCEPTION)
	public WebElement brake_oil_exception;
	
	@AndroidFindBy(uiAutomator  =Constants.ASSESS_OIL_EXCEPTION)
	public WebElement asess_oil_exception;
	
	
	
	@AndroidFindBy(uiAutomator  =Constants.BATTERY_CHECK)
	public WebElement battery_check;
	
	@AndroidFindBy(uiAutomator  =Constants.BELT_CHECK)
	public WebElement belt_check;
	
	
	
	
	//漆面修复历史
	
	@AndroidFindBy(uiAutomator  =Constants.PAINT_REPAIR_HISTORY_)
	public WebElement paint_repaire_history_;
	
	
	//当前状况说明
	@AndroidFindBy(uiAutomator  =Constants.CURRENTSTATE_PAINT_)
	public WebElement currentstate_paint_;
	
	//修复整备说明
	@AndroidFindBy(uiAutomator  =Constants.REPAIR_DESCRIBE_)
	public WebElement repaire_describe_;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AndroidFindBy(uiAutomator  =Constants.EDIT_MILE)
	public WebElement edit_mile;
	
	@AndroidFindBy(uiAutomator  =Constants.NEW_SHOOT)
	public WebElement new_shoot;
	
	
	@AndroidFindBy(uiAutomator  =Constants.START_CHECK)
	public WebElement start_check;
	
	
	@AndroidFindBy(uiAutomator  =Constants.ENGIN_CHECK)
	public WebElement engine_check;
	
	@AndroidFindBy(uiAutomator  =Constants.TURN_CHECK)
	public WebElement turn_check;
	
	@AndroidFindBy(uiAutomator  =Constants.SMOKE)
	public WebElement smoke;
	
	@AndroidFindBy(uiAutomator  =Constants.OPERATION)
	public WebElement operation;
	
	@AndroidFindBy(uiAutomator  =Constants.ABNORMAL_SOUND)
	public WebElement abnormal_sound;
	
	@AndroidFindBy(uiAutomator  =Constants.SHAKING)
	public WebElement shaking;
	
	@AndroidFindBy(uiAutomator  =Constants.ELECTRIC)
	public WebElement electric;
	
	@AndroidFindBy(uiAutomator  =Constants.ROAD_TEST)
	public WebElement road_test;
	
	
	@AndroidFindBy(uiAutomator  =Constants.SAVE_TONEXT)
	public WebElement save_tonext;
	
	
	@AndroidFindBy(uiAutomator  =Constants.NX)
	public WebElement nx;
	
	@AndroidFindBy(uiAutomator  =Constants.SPEEDBOX)
	public WebElement speedbox;
	
	@AndroidFindBy(uiAutomator  =Constants.SPARE_TIRE)
	public WebElement spare_tire;
	
	
	@AndroidFindBy(uiAutomator  =Constants.TOOLS)
	public WebElement tools;
	
	@AndroidFindBy(uiAutomator  =Constants.WHETHER_MODIFICATION)
	public WebElement whether_modification;
	
	@AndroidFindBy(xpath  =Constants.PAINT_REPAIR_HISTORY)
	public WebElement paint_repair_hisory;
	
	
	@AndroidFindBy(xpath  =Constants.PARTIAL_PAINT)
	public WebElement partial_paint;
	
	@AndroidFindBy(xpath  =Constants.CURRENTSTATE_PAINT)
	public WebElement currentstate_paint;
	
	
	
	@AndroidFindBy(xpath  =Constants.GENERAL_QUALITY)
	public WebElement general_quality;
	
	@AndroidFindBy(xpath  =Constants.REPAIR_DESCRIBE)
	public WebElement repair_decribe;
	
	
	@AndroidFindBy(xpath  =Constants.REPAIR_PART)
	public WebElement repair_part;
	
	
	@AndroidFindBy(uiAutomator  =Constants.CAR_DESCRIBE)
	public WebElement car_describe;
	
	@AndroidFindBy(uiAutomator  =Constants.COMPREHENSIVE_CONDITION_RATINGS)
	public WebElement comprehensive_condition_ratings;
	
	
	@AndroidFindBy(uiAutomator  =Constants.MAINTENANCE_COSTS_RATINGS)
	public WebElement maintenance_costs_ratings;
	
	//**********************************************************************************************************
	//**********************************************************************************************************
	//**********************************************************************************************************
	@AndroidFindBy(xpath  =Constants.HUASHANG)
	public WebElement huashang;
	
	
//	 driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.youxinpai.checkauto.act:id/head_back\")").click();
	
//	@AndroidFindBy(uiAutomator  =Constants.HEAD_BACK1)
//	public WebElement headback;
	
//	CK3_WGHS1
	@AndroidFindBy(xpath  =Constants.CK3_WGHS1)
	public WebElement ck3_wghs1;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGHS2)
	public WebElement ck3_wghs2;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGHS3)
	public WebElement ck3_wghs3;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGHS4)
	public WebElement ck3_wghs4;
	
	//凹坑CK3_WGAK  CK3_WGAK
	@AndroidFindBy(xpath  =Constants.CK3_WGAK)
	public WebElement ck3_wgak;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGAK1)
	public WebElement ck3_wgak1;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGAK2)
	public WebElement ck3_wgak2;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGAK3)
	public WebElement ck3_wgak3;
	
	
	//变形CK3_WGBX
	@AndroidFindBy(xpath  =Constants.CK3_WGBX)
	public WebElement ck3_wgbx;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGBX1)
	public WebElement ck3_wgbx1;
//	
	@AndroidFindBy(xpath  =Constants.CK3_WGBX2)
	public WebElement ck3_wgbx2;
//	
	@AndroidFindBy(xpath  =Constants.CK3_WGBX3)
	public WebElement ck3_wgbx3;
	
	
	//色差 CK3_WGSC
	@AndroidFindBy(xpath  =Constants.CK3_WGSC)
	public WebElement ck3_wwgsc;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGSC_1)
	public WebElement ck3_wwgsc_1;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGSC1)
	public WebElement ck3_wwgsc1;
//	
	@AndroidFindBy(xpath  =Constants.CK3_WGSC2)
	public WebElement ck3_wwgsc2;
//	
	@AndroidFindBy(xpath  =Constants.CK3_WGSC3)
	public WebElement ck3_wwgsc3;
	
	
	//玻璃检查CK3_BL
	
	@AndroidFindBy(xpath  =Constants.CK3_BL)
	public WebElement ck3_bl;
	
	@AndroidFindBy(xpath  =Constants.CK3_BL1)
	public WebElement ck3_bl1;
//	
	@AndroidFindBy(xpath  =Constants.CK3_BL2)
	public WebElement ck3_bl2;
//	
	@AndroidFindBy(xpath  =Constants.CK3_BL3)
	public WebElement ck3_bl3;
	
	
	@AndroidFindBy(xpath  =Constants.CK3_BL4)
	public WebElement ck3_bl4;
	
	//后续还有子选项
	
	
	//更换CK3_WGGH
	@AndroidFindBy(xpath  =Constants.CK3_WGGH)
	public WebElement ck3_wggh;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGGH_1)
	public WebElement ck3_wggh_1;
	
	
	@AndroidFindBy(xpath  =Constants.CK3_WGGH1)
	public WebElement ck3_wggh1;
	
	//胶条异常CK3_JT
	@AndroidFindBy(xpath  =Constants.CK3_JT)
	public WebElement ck3_jt;
	
	@AndroidFindBy(xpath  =Constants.CK3_JT1)
	public WebElement ck3_jt1;
//	
	@AndroidFindBy(xpath  =Constants.CK3_JT2)
	public WebElement ck3_jt2;
	@AndroidFindBy(xpath  =Constants.CK3_JT3)
	public WebElement ck3_jt3;
	
	
	//托底 CK3_DPTD 只有一个 CK3_DPTD
	@AndroidFindBy(xpath  =Constants.CK3_DPTD)
	public WebElement ck3_dptd;
	
	
	@AndroidFindBy(xpath  =Constants.CK3_DPTD1)
	public WebElement ck3_dptd1;
	
	//滴漏 CK3_DPLY 只有一个 
	@AndroidFindBy(xpath  =Constants.CK3_DPLY)
	public WebElement ck3_dply;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPLY1)
	public WebElement ck3_dply1;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPLY2)
	public WebElement ck3_dply2;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPLY3)
	public WebElement ck3_dply3;
	
	
	//生锈痕迹 CK3_DPXS 只有一个 
	
	@AndroidFindBy(xpath  =Constants.CK3_DPXS)
	public WebElement ck3_dpxs;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPXS1)
	public WebElement ck3_dpxs1;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPXS2)
	public WebElement ck3_dpxs2;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPXS3)
	public WebElement ck3_dpxs3;
	
	//破裂 CK3_WGPL
	@AndroidFindBy(xpath  =Constants.CK3_WGPL)
	public WebElement ck3_wgpl;
	
	@AndroidFindBy(xpath  =Constants.CK3_WGPL1)
	public WebElement ck3_wgpl1;
	
	
	//轮胎异常CK3_CLLT
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLT)
	public WebElement ck3_cllt;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLT1)
	public WebElement ck3_cllt1;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLT2)
	public WebElement ck3_cllt2;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLT3)
	public WebElement ck3_cllt3;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLT4)
	public WebElement ck3_cllt4;
	
	
	
	//轮毂异常CK3_CLLG  CK3_CLLG
	@AndroidFindBy(xpath  =Constants.CK3_CLLG)
	public WebElement ck3_cllg;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLG1)
	public WebElement ck3_cllg1;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLG2)
	public WebElement ck3_cllg2;
	
	@AndroidFindBy(xpath  =Constants.CK3_CLLG3)
	public WebElement ck3_cllg3;
	
    //减震器 CK3_JZLY
	@AndroidFindBy(xpath  =Constants.CK3_JZLY)
	public WebElement ck3_jzly;
	
	@AndroidFindBy(xpath  =Constants.CK3_JZLY1)
	public WebElement ck3_jzly1;
	
    //减震器胶套损坏 CK3_JZJT
	@AndroidFindBy(xpath  =Constants.CK3_JZJT)
	public WebElement ck3_jzjt;
	
	@AndroidFindBy(xpath  =Constants.CK3_JZJT1)
	public WebElement ck3_jzjt1;
	
    //减震器变形 CK3_ZJBX
	@AndroidFindBy(xpath  =Constants.CK3_ZJBX)
	public WebElement ck3_zjbx;
	
	@AndroidFindBy(xpath  =Constants.CK3_ZJBX1)
	public WebElement ck3_zjbx1;
	
	
	
    //钣金痕迹 CK3_GJBJ
	@AndroidFindBy(xpath  =Constants.CK3_GJBJ)
	public WebElement ck3_gjbj;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBJ1)
	public WebElement ck3_gjbj1;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBJ2)
	public WebElement ck3_gjbj2;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBJ3)
	public WebElement ck3_gjbj3;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBJ4)
	public WebElement ck3_gjbj4;
	
    //变形痕迹 CK3_GJBX
	@AndroidFindBy(xpath  =Constants.CK3_GJBX)
	public WebElement ck3_gjbx;
    //变形痕迹切换到第五个选项  车头🚗5/5	
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBX_1)
	public WebElement ck3_gjbx_1;
    //变形痕迹切换到第五个选项  车头🚗5/5	
	
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBX1)
	public WebElement ck3_gjbx1;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBX2)
	public WebElement ck3_gjbx2;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJBX3)
	public WebElement ck3_gjbx3;
	
	
	
	   //锈蚀痕迹CK3_FHBXS 
	@AndroidFindBy(xpath  =Constants.CK3_FHBXS)
	public WebElement ck3_fhbxs;
	
	@AndroidFindBy(xpath  =Constants.CK3_FHBXS1)
	public WebElement ck3_fhbxs1;
	
	@AndroidFindBy(xpath  =Constants.CK3_FHBXS2)
	public WebElement ck3_fhbxs2;
	
	@AndroidFindBy(xpath  =Constants.CK3_FHBXS3)
	public WebElement ck3_fhbxs3;
	
    //拆卸痕迹 CK3_GJCX
	@AndroidFindBy(xpath  =Constants.CK3_GJCX)
	public WebElement ck3_gjcx;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJCX1)
	public WebElement ck3_gjcx1;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJCX2)
	public WebElement ck3_gjcx2;
	
	@AndroidFindBy(xpath  =Constants.CK3_GJCX3)
	public WebElement ck3_gjcx3;
	
	
    //CK3_NSWZ 污渍
	
	@AndroidFindBy(xpath  =Constants.CK3_NSWZ1)
	public WebElement ck3_nswz1;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSWZ2)
	public WebElement ck3_nswz2;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSWZ3)
	public WebElement ck3_nswz3;
	
    //磨损CK3_NSMS
	
	@AndroidFindBy(xpath  =Constants.CK3_NSMS)
	public WebElement ck3_nsms;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSMS1)
	public WebElement ck3_nsms1;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSMS2)
	public WebElement ck3_nsms2;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSMS3)
	public WebElement ck3_nsms3;


    //变形 CK3_NSBX
	@AndroidFindBy(xpath  =Constants.CK3_NSBX)
	public WebElement ck3_nsbx;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSBX1)
	public WebElement ck3_nsbx1;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSBX2)
	public WebElement ck3_nsbx2;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSBX3)
	public WebElement ck3_nsbx3;
	
	// CK3_NSTX 塌陷
	@AndroidFindBy(xpath  =Constants.CK3_NSTX)
	public WebElement ck3_nstx;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSTX1)
	public WebElement ck3_nstx1;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSTX2)
	public WebElement ck3_nstx2;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSTX3)
	public WebElement ck3_nstx3;
	
	
	// CK3_GJBJ CK3_GJBJ钣金痕迹

	
	//凹陷 CK3_NSOX
	
	@AndroidFindBy(xpath  =Constants.CK3_NSOX)
	public WebElement ck3_nsox;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSOX1)
	public WebElement ck3_nsox1;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSOX2)
	public WebElement ck3_nsox2;
	
	@AndroidFindBy(xpath  =Constants.CK3_NSOX3)
	public WebElement ck3_nsox3;
	
	
	   //水泡 CK3_SPJC
	@AndroidFindBy(xpath  =Constants.CK3_SPJC)
	public WebElement ck3_spjc;
	
	@AndroidFindBy(xpath  =Constants.CK3_SPJC1)
	public WebElement ck3_spjc1;
	
//  锈蚀不清  CK3_CJXS
	@AndroidFindBy(xpath  =Constants.CK3_CJXS)
	public WebElement ck3_cjxs;
	
	@AndroidFindBy(xpath  =Constants.CK3_CJXS1)
	public WebElement ck3_cjxs1;
	

	
 //缺损CK3_CJQS
	@AndroidFindBy(xpath  =Constants.CK3_CJQS)
	public WebElement ck3_cjqs;
	
	@AndroidFindBy(xpath  =Constants.CK3_CJQS1)
	public WebElement ck3_cjqs1;
	
 // 事故变形CK3_CJSG
	@AndroidFindBy(xpath  =Constants.CK3_CJSG)
	public WebElement ck3_cjsg;
	
	@AndroidFindBy(xpath  =Constants.CK3_CJSG1)
	public WebElement ck3_cjsg1;
	
	
	
 // 篡改嫌疑CK3_CJCG
	@AndroidFindBy(xpath  =Constants.CK3_CJCG)
	public WebElement ck3_cjcg;
	
	@AndroidFindBy(xpath  =Constants.CK3_CJCG1)
	public WebElement ck3_cjcg1;
	
	 // 发动机舱 17/18
	@AndroidFindBy(xpath  =Constants.OIL_CHECK)
	public WebElement oil_check;
	
	@AndroidFindBy(xpath  =Constants.ANTIFREEZE_CHECK)
	public WebElement antifreeze_check;
	
	@AndroidFindBy(xpath  =Constants.BRAKE_FLUID_CHECK)
	public WebElement brake_fluid_check;
	
	@AndroidFindBy(xpath  =Constants.BOOST_OIL_CHECK)
	public WebElement boost_oil_check;
	
	
	//18/18
	@AndroidFindBy(xpath  =Constants.SHOOT18_18)
	public WebElement shoot18_18;
	
	
	
    //排气管锈裂CK3_DPXL
	@AndroidFindBy(xpath  =Constants.CK3_DPXL)
	public WebElement ck3_dpxl;
	
	@AndroidFindBy(xpath  =Constants.CK3_DPXL1)
	public WebElement ck3_dpxl1;
	///////////////////////
    //基本信息
	@AndroidFindBy(xpath  =Constants.BASIC_INFO_2)
	public WebElement basic_info_2;
	
	
    //车牌号第一个车牌位置选择框
	
	@AndroidFindBy(xpath  =Constants.CAR_PROVINCE_box)
	public WebElement car_province_box;
	
	@AndroidFindBy(uiAutomator  =Constants.CAR_PROVINCE)
	public WebElement car_province;
	
	  //输入字母数字组合 6-7车牌号
	@AndroidFindBy(uiAutomator  =Constants.CAR_NUM)
	public WebElement car_num;

	
    //车辆类型选择框
	@AndroidFindBy(uiAutomator  =Constants.CAR_TYPE_BOX)
	public WebElement car_type_box;
	
	  //选择车辆类型  选择越野车
	@AndroidFindBy(xpath  =Constants.CAR_TYPE)
	public WebElement car_type;
	
	  //选择所有人  公户
	
	
	
	@AndroidFindBy(xpath  =Constants.CAR_PUBLISER)
	public WebElement car_publiser;
	
	
	
	@AndroidFindBy(xpath  =Constants.USING_NATURE_BOX)
	public WebElement using_nature_box;
	
	
	
	@AndroidFindBy(xpath  =Constants.USING_NATURE)
	public WebElement using_nature;
	
	
	
	
	
	
	
	
	
	public CopyOfGenerate_orders(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void into() throws InterruptedException {
		
		Thread.sleep(3000);
		login_button.click();
		Thread.sleep(5000);
		new_add_detection.click();
		
//		Thread.sleep(5000);
//		index1.click();
//		choose_confirm.click();
		
		/*edit_search.sendKeys("北京现场测试公司");
		search_button.click();
		search_index1.click();
		confirm_yes.click();*/
		
		//点击  基本信息 参数化
		basic_info.click();
		/*car_num_area_list.click();
		car_num_area_list_index.click();
		car_num.sendKeys("LYN100");
		//车辆类型
		car_type_box.click();
		car_type.click();
		//所有人 公户
		car_publiser_.click();
		//是否一手车
		firsthand_n.click();
		
		//过户票
		transfer_user_y.click();
		
		
		//上次过户日期
		transfer_date.click();
		confirm_yes.click();
		
		
		//过户次数
		transfer_times_input.click();
		
		transfer_times.click();
		
		//使用性质
		using_nature_.click();
		
		using_nature_index.click();
		//VIN 输入
		vin_code_.sendKeys("LYW091");
		
		//车型车系
		models_cars.click();
		models_cars_1.click();
		models_cars_1_2.click();
		models_cars_1_2_3.click();
		
		//国标码
		guobiao_num.sendKeys("LYW000001");
		
		Thread.sleep(2000);*/
		
		//需要滑动
//		driver.scrollTo("出场日期");
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width/2, height*6/10, width/2, height/10, 1000);
		
//		Thread.sleep(2000);
		//出场日期
	/*	production_date.click();
		confirm_yes.click();
		
		//发动机号
		engine_num.sendKeys("LYW0000001");
		
		//注册日期
		register_date.click();
		confirm_yes.click();
		
		 //交强险
		jiaoqiangxian_n.click();
		
		
		//商业险
		commercial_insurance_n.click();
		
		//年检
		nianjian_n.click();
		
		//车船税
		travel_tax_n.click();*/
		driver.swipe(width/2, height*6/10, width/2, height/10, 1000);
		//库存地
		car_inventory_input.click();
		
		/*car_inventory_province.click();
		car_inventory_province_index.click();
		
		car_inventory_city.click();
		car_inventory_city_index.click();
		
		confirm_yes.click();*/
		
		
	    WebElement ee = driver.findElementById("com.youxinpai.checkauto.act:id/sd_sidebar");
	    //获取对象的left,top
	    Point p1 = ee.getLocation();
	    //获取对象的 宽
	    int w1 = ee.getSize().width;
	    //获取对象的 高
	    int h1 =ee.getSize().height;
	    	    
	    //对象的bounds 【p1.x, p1.y】【p1.x+w1, p1.y+h1】
	    //Rect r = new Rect(p1.x, p1.y, p1.x+w1, p1.y+h1);
	    //Rect r = new Rect(int left, int top, int right, int bottom) UIAUTOMATOR位置对象
	    	    
	    	    //元素高度 bottom-top
	    	    int h2 = p1.y+h1 - p1.y;
	    	    
	    	   //因为有22个字母，所以除以22，计算出每个字母的高度
	          int  h3 = h2/22;
	    	    

	    // 计算X坐标的方法 
//	            public final float exactCenterX() {
//	                return (left + right) * 0.5f;
//	            }
	    //计算Y坐标的主法
//	            public final int centerY() {
//	                return (top + bottom) >> 1;
//	            }
	            //x坐标不会变化
	            int x = (p1.x+p1.x+w1) >>1;
	            
	            //Y坐标是top + bottom  
	            //坐标从上面往下增大，下面往上减少
	             int y = 0;
	            for(int n=0 ;n<22;n++){
	            	
	            	y = ((p1.y+(n*h3))+(p1.y+h1-((22-n)*h3))) >>1;
	            driver.tap(1, x,y,500);
	            }
	           
	    
	    
	   
        
        
        driver.tap(1, x,y,500);
        
//        driver.tap(1, x,y,500);
//        
//        driver.tap(1, x,y,500);
        
        
//	    System.out.println(ee.getText());
//	    System.out.println(ee.getAttribute("index"));
	    
	    System.out.println("------");
	    
	  /*  Point p=ee.getLocation();
	    System.out.println(p.x);
	    System.out.println(p.y);
	    Thread.sleep(10000);
	    
	    ee.click();*/
	    
	    Thread.sleep(15000);
	    TouchAction act = new TouchAction(driver);
	    act.longPress(1035, 251).moveTo(1035, 1873).release().perform();
	    
	    
	    
//		WebElement datePicker= driver.findElement(By.name("Date Picker"));
//		WebElement steppers= driver.findElement(By.name("Steppers"));
		int startY=ee.getLocation().y;
		int endY=ee.getLocation().y;
		System.out.println(startY +" -- "+ endY);
		
		Thread.sleep(10000);
		//act.press(datePicker, 30, 10).release().perform();
		
		//act.press(150, startY).moveTo(150, endY).release().perform();
//act.press(ee, 30, 10).moveTo(act).release().perform();


//	    ee.
//		obj = deriver.findByid("A");
//        Rect r = obj.getBounds();
//        //元素高度
//        int h = r.height(); 
//
//        //应该是每一个字符的高度
//        int  h1 = h/22;
//
//        //第一个字符的 坐标应该是
//        Rect r1 = new Rect(1062,225+(2*h1),1152,1776-((22-2)*h1));
//        device.click(r1.centerX(),r1.centerY());
		
		
		//车身颜色
		choose_car_color.click();
		choose_white_color.click();
		
		//燃油类型
		fuel_type.click();
		choose_electric.click();
		
		/*int w = driver.manage().window().getSize().width;
		int h = driver.manage().window().getSize().height;
		driver.swipe(w/2, h*6/10, w/2, h/10, 1000);*/
		
		displacement1.click();
		displacement1_index.click();
		
		displacement2.click();
		displacement2_index.click();
//		driver.scrollTo("保存信息");
		
		//车钥匙
		car_key.click();
		//2
		car_key_2.click();
		
		save_info.click();
		
		//
		
		//
		
		//
		
		//
		
		//
		
		//
		
        //
		
		//
		
		//
		
		//
		
		//
		
		//
		
//		using_nature_box.click();
//		using_nature.click();
		
		
		
		
		
		
		
	}
	
	
	
	public void credentials_shoot() throws InterruptedException {
		
		/*Thread.sleep(3000);
		login_button.click();
		Thread.sleep(5000);
		new_add_detection.click();
		
//		Thread.sleep(5000);
//		index1.click();
//		choose_confirm.click();
		
		edit_search.sendKeys("北京现场测试公司");
		search_button.click();
		search_index1.click();
		confirm_yes.click();*/
		
		credentials_shoot.click();
		
		pictures_list1.click();
		
		
		//行驶证正面
        click_camera.click();
        Thread.sleep(2000);
        save_picture.click();
        
      //行驶证副证(必拍)
        click_camera.click();
        Thread.sleep(2000);
        save_picture.click();
      //行驶证副证背面
        right_next_arrow.click();
        
      //行驶证车辆照片
        right_next_arrow.click();
        
		
		//登记证第一页 必拍
        click_camera.click();
        Thread.sleep(2000);
        save_picture.click();
		
		//登记证第二页 必拍
        click_camera.click();
        Thread.sleep(2000);
        save_picture.click();
        
		//登记证第三页
        right_next_arrow.click();
		//登记证第四页
        right_next_arrow.click();
        
		//登记证第五页
        right_next_arrow.click();
        //登记证第六页
        right_next_arrow.click();
		//商业保险单据上部
        right_next_arrow.click();
		//商业保险单下部
        right_next_arrow.click();
		//保险单批单
        right_next_arrow.click();
		//交强险单据上部
        right_next_arrow.click();
		//交强险单据下部
        right_next_arrow.click();
		
      //交强险批单
        right_next_arrow.click();
        
      //车辆发票
        right_next_arrow.click();
      //购置税第一页
        right_next_arrow.click();
      //购置税第二页
        right_next_arrow.click();
        //气瓶证第一页
        right_next_arrow.click();
      //气瓶证第二页
        right_next_arrow.click();
        //进口商检单
        right_next_arrow.click();
      //货运资格证
        right_next_arrow.click();
      //车船税票
        right_next_arrow.click();
      //退出拍照
        exit_shoot.click();
        exit_shoot_yes.click();
        head_back.click();
        
        
        
	}
	
	public void new_add_detection1(){
		new_add_detection.click();
		
	}
	
	public void car_detection() throws InterruptedException {
		
		
		/*Thread.sleep(3000);
		login_button.click();
		Thread.sleep(5000);
		new_add_detection.click();
		
//		Thread.sleep(5000);
//		index1.click();
//		choose_confirm.click();
		
		edit_search.sendKeys("北京现场测试公司");
		search_button.click();
		Thread.sleep(2000);
		search_index1.click();
		confirm_yes.click();*/
		
		
		
		car_front_.click();
	    take_photo_start.click();
	    Thread.sleep(2000);
	    
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    
	    next_page.click();
	    //车头2/5
	    no_exception.click();
	    
		//车头3/5
	    no_exception.click();
	    //
	    no_exception.click();
	    //5/5
	    no_exception.click();
	    //1/18
	    no_exception.click();
	    //2/18
	    no_exception.click();
	    //3/18
	    no_exception.click();
	    //4/18
	    no_exception.click();
	    //5/18
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    //6/18
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    
	    //7/18
	    no_exception.click();
	    
	    //8/18
	    no_exception.click();
	    //9/18
	    no_exception.click();
	    
	    //10/18
	    no_exception.click();
	    //11/18
	    no_exception.click();
	    //12/18
	    no_exception.click();
	    //13/18
	    no_exception.click();
	    //14/18
	    no_exception.click();
	    //15/18
	    no_exception.click();
	   //仪表16/18
	    
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    edit_mile.sendKeys("3");
	    
	    next_page.click();
	    
	    //17/18
	    
	    no_exception.click();
	    //18/18
	    no_exception.click();
	    //机电检查
	    start_check.click();
	    engine_check.click();
	    turn_check.click();
	    smoke.click();
	    operation.click();
	    electric.click();
	    road_test.click();
	    speedbox.click();
	    
	    save_tonext.click();
	    
	  // 左后车门1/13
	    no_exception.click();
	    
	 // 左后车身 2/13 
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    
	 // 左后车身 3/13 
	    no_exception.click();
	    
	    
	 // 左后车身 4/13 左后车门内饰 
	    no_exception.click();
	    
	 // 左后车身 5/13 左B柱铰链
	    no_exception.click();
	 // 左后车身 6/13 左C柱上部 
	    no_exception.click();
	    
	 // 左后车身 7/13 左C柱 
	    no_exception.click();
	    
	 // 左后车身 8/13 左后车门裙边
	    no_exception.click();
	    
	 // 左后车身 9/13 仪表台
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    
	    
	 // 左后车身 10/13 左后座椅 
	    no_exception.click();
	    
	 // 左后车身 11/13 左后翼子板 
	    no_exception.click();
	    
	 // 左后车身 12/13 左后车轮
	    no_exception.click();
	    
	 // 左后车身 13/13 左后减震器
	    no_exception.click();
	    
	 // 后备箱 1/14 后风挡玻璃 
	    no_exception.click();
	    
	 // 后备箱 2/14 后备箱盖 
	    no_exception.click();
	    
	 // 后备箱 3/14 车尾正视区域 
	    no_exception.click();
	    
	 // 后备箱 4/14 车尾正视区域 
	    
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    
	 // 后备箱 5/14 车尾正视区域 
	    spare_tire.click();
	    tools.click();
	    save_tonext.click();
	    
	 // 后备箱 6/14 后备箱 
	    no_exception.click();
	    
	 // 后备箱 7/14 后备箱盖内部
	    no_exception.click();
	 // 后备箱 8/14 后备箱左铰链
	    no_exception.click();
	 // 后备箱 9/14 左后翼子板内衬
	    no_exception.click();
	    
	 // 后备箱 10/14 后围板
	    no_exception.click();
	 // 后备箱 11/14 后备箱底板 
	    no_exception.click();
	 // 后备箱 12/14 右后翼子板内衬 
	    no_exception.click();
	 // 后备箱 13/14 后备箱右铰链 
	    no_exception.click();
	 // 后备箱 14/14 车辆后底盘 
	    no_exception.click();
	 // 后备箱 1/11 右后45度 
	    take_photo_start.click();
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    
	 // 右后车身 2/11 右后翼子板 
	    no_exception.click();
	 // 右后车身 3/11 右后车轮
	    no_exception.click();
	 // 右后车身 4/11 右后减震器
	    no_exception.click();
	 // 右后车身 5/11 右后车门
	    no_exception.click();
	 // 右后车身 6/11 右后车门骨架
	    no_exception.click();
	 // 右后车身 7/11 右后车门内饰
	    no_exception.click();
	 // 右后车身 8/11 右B柱铰链
	    no_exception.click();
	 // 右后车身 9/11 右C柱上部
	    no_exception.click();
	 // 右后车身 10/11 右C柱
	    no_exception.click();
	 // 右后车身 11/11  右后车门裙边
	    no_exception.click();
	    
	 // 右前车身 1/12 右前车门
	    no_exception.click();
	    
	 // 右前车身 2/12 右前车门骨架
	    no_exception.click();
	 // 右前车身 3/12 右前车门内饰
	    no_exception.click();
	 // 右前车身 4/12 右A柱下部
	    no_exception.click();
	 // 右前车身 5/12 右A柱上部
	    no_exception.click();
	 // 右前车身 6/12 右B柱
	    no_exception.click();
	 // 右前车身 7/12 右前车门裙边
	    no_exception.click();
	 // 右前车身 8/12 副驾驶席区域
	    no_exception.click();
	 // 右前车身 9/12 车顶内饰
	    no_exception.click();
	 // 右前车身 10/12 右前翼子板
	    no_exception.click();
	 // 右前车身 11/12 右前车轮
	    no_exception.click();
	 // 右前车身 12/12 右前减震器
	    no_exception.click();
	    
	    
	 // 车顶 1/1
	    no_exception.click();
	    
	 // 发动机舱 1/18 发动机全景
	    take_photo_start.click();
	    Thread.sleep(2000);
	    take_photo.click();
	    Thread.sleep(2000);
	    save_photo.click();
	    next_page.click();
	    
	 // 发动机舱 2/18 发动机舱
	    no_exception.click();
	 // 发动机舱 3/18 发动机盖内侧
	    no_exception.click();
	 // 发动机舱 4/18 发动机盖左侧铰链
	    no_exception.click();
	 // 发动机舱 5/18 左侧减震器支架
	    no_exception.click();
	 // 发动机舱 6/18 左侧发动机翼子板架
	    no_exception.click();
	 // 发动机舱 7/18 左侧水箱框架
	    no_exception.click();
	 // 发动机舱 8/18 左前梁头
	    no_exception.click();
	 // 发动机舱 9/18 水箱框架
	    no_exception.click();
	 // 发动机舱 10/18 前横梁
	    no_exception.click();
	 // 发动机舱 11/18 右前纵梁
	    no_exception.click();
	 // 发动机舱 12/18 右侧水箱框架
	    no_exception.click();
	 // 发动机舱 13/18 右侧减震器支架
	    no_exception.click();
	 // 发动机舱 14/18 右侧发动机翼子板架
	    no_exception.click();
	 // 发动机舱 15/18 发动机盖右侧铰链
	    no_exception.click();
	 // 发动机舱 16/18 防火墙
	    no_exception.click();
	 // 发动机舱 17/18 车架号
	    no_exception.click();
	 // 发动机舱 18/18  检测列表
	    eng_oil_yes.click();
	    liqued_yes.click();
	    brake_oil_exception.click();
	    asess_oil_exception.click();
	    battery_check.click();
	    belt_check.click();
	    
	    save_tonext.click();
	    
	  //改装说明 1/1
	    whether_modification.click();
	    save_tonext.click();
	    
	    
	 // 漆面修复概况 1/2
	    nx.click();
	    
	 // 漆面修复概况 2/2
	    nx.click();
	    
	 // 漆面复合评价1/1
	    paint_repaire_history_.click();
	    partial_paint.click();
	    
	  //当前状况说明

	    
	    currentstate_paint_.click();
	    
	    general_quality.click();
	    
	  //修复整备说明
	    repaire_describe_.click();
	    repair_part.click();
	    
	    car_describe.sendKeys("QA Test");
	    
	    //评级
	    save_tonext.click();
	    
	    comprehensive_condition_ratings.click();
	    driver.scrollTo("维护成本评级");
	    maintenance_costs_ratings.click();
	    
	    
	    save_tonext.click();
	    
	}
	
	public void baseInfo() throws InterruptedException {
		
		System.out.println("进入 基本信息  选项------开始填写基本信息");
		baseinformation.click();
		
		System.out.println("车牌号 选项------先选择车籍地以及车牌号");
		
		
		license_plate_number.sendKeys("a139105");
		
		System.out.println("车辆类型 选项------先点击然后选取车辆类型");
		vehicle_type.click();
		choose_vehicle_type.click();
		
		System.out.println("所有人 选项------选择公户或者私户");
		holder.click();
		use_properties.click();
		System.out.println("使用性质 选项------");
		operations.click();
		
		System.out.println("VIN码 选项------");
		vin.sendKeys("131105");
		
		System.out.println("车型车系 选项------");
		choose_car_model.click();
		driver.scrollTo("大众");
		select_vehicle_brand.click();
		select_car_series.click();
		select_car_type.click();
		
		System.out.println("国标码 选项------");
		guobiao_no.sendKeys("93X88105");
//		driver.hideKeyboard();
		top_text.click();
		
		
		Thread.sleep(8000);
		System.out.println("出厂日期 选项------");
		production_date.click();
		
		confirm_current_date.click();
		
		System.out.println("发动机号 选项------");
		engine_no.sendKeys("LNBSCCBH93X88105");
//		top_text.click();
//		
		System.out.println("注册日期选项------");
		scroll_to_datescreen.click();
		confirm_current_date.click();
		System.out.println("开始翻页------");
		
		driver.scrollTo("燃油类型");
		System.out.println("交强险到期日期 ------ ");
		forassurance.click();
		confirm_current_date.click();
		
		System.out.println("库存地");
		
		inventory.click();
		choose_inventory.click();
		
		choose_beijing.click();
		
		confirm_inventory.click();
		
		System.out.println("车身颜色------");
		choose_car_color.click();
		
		choose_white_color.click();
		System.out.println("燃油类型------");
		fuel_type.click();
		
		choose_electri.click();
		
		System.out.println("车钥匙------");
		car_key.click();
		
		car_key_2.click();
		System.out.println("✅基本信息保存");
		save_info.click();
		
		
		
		

//		driver.scrollTo("燃油类型");
			
		
		
	}
	
	
	public void certificate_shoot() {
		
		credentials_take_picture.click();
//		car_front.click();
		front_shoot.click();
	
		click_shoot.click();
		save_picture.click();
		click_shoot.click();
		save_picture.click();
		
		yes.click();
		
		reg_certificate.click();//登记证
		click_shoot.click();
		save_picture.click();
		click_shoot.click();
		save_picture.click();
		exit_shoot.click();
		exit_shoot_yes.click();
		head_back.click();

	}
	
	public void carCheck_takePicture() {
		//注意是否已经点击 初始化掉按钮
		take_photo.click();
		click_camera.click();
		
		save_photo.click();
		next_page.click();

		
	}
	
	public void  car_front_start() {
		car_front.click();
//		carCheck_takePicture();
		
	}
	
	public void flaw() {
		abnormal_yes.click();
//		take_photo.click();
		click_shoot.click();
		add_flaw.click();
		
		
	}
	//划伤 2/5的瑕疵点
	public void  CK3_WGHS() {
		System.out.println("******🚗车头  2/5 发动机盖 瑕疵点******");
		System.out.println("1划伤[4] 2凹坑[3] 3变形痕迹[3] 4色差[3] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8掉漆[3] 9丢件[1]  10漆面异常[1]");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		
		System.out.println("车头🚗2/5 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		
		
		System.out.println("🚗车头  2/5 ✅发动机盖 瑕疵点添加完毕!");
		
		System.out.println("✅4个 还有第四项 色差 剩余1个----- 4色差[1] 5生锈痕迹[3] 6修补痕迹[3] 7破裂[1] 8掉漆[3] 9丢件[1]  10漆面异常[1] 剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("第二轮🈶️");
		next_page.click();
		
		
	}
	
	public void carFront3_5() {
		System.out.println("******🚗车头  3/5  前风挡玻璃 瑕疵点******");
		System.out.println("1玻璃检查[4] 2更换[1] 3胶条异常[2]");
		
		System.out.println("前风挡玻璃 ✅单选项4个瑕疵点");
		//从 当前回合检查项开始点击
		ck3_bl.click();
		ck3_bl1.click();
		add_flaw.click();
		ck3_bl2.click();
		add_flaw.click();
		ck3_bl3.click();
		add_flaw.click();
		ck3_bl4.click();
		
		save_flaw.click();
		System.out.println("完成第一个选项的玻璃的操作");
		
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项卡开始***** 点击 更换");
		//点击第二个左侧List栏
		ck3_wggh.click();
		System.out.println("当前选项只有一个 后续需要补充3个 胶条异常2个还是没满足4个需求***需求是点满为止 不多不少 所以第三个子Tap skip");
		ck3_wggh1.click();
		
		add_flaw.click();
		
		ck3_jt.click();
		
		ck3_jt1.click();
		add_flaw.click();
		ck3_jt2.click();
		save_flaw.click();
		System.out.println("✅🚗头 3/5的检测(四舍五入原则---只点剩余不满4个点瑕疵点)直接点击下一项");
		
		System.out.println("第二轮🈚️");
		next_page.click();

		
	}
	
	public void  carFront4_5() {
		System.out.println("******🚗车头  4/5 车头正视区域 瑕疵点******");
		System.out.println("1划伤[4] 2凹坑[3] 3变形痕迹[3] 4色差[3] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8水泡[1] 9破裂[1]  10丢件[1]  11晃动[1]  12板间间隙[1] 13灯组检测[2]");
		
		System.out.println("车头正视区域  从头开始点击 鉴于2/5是不同列表项");
		//从 当前回合检查项开始点击
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
//		System.out.println("从第二项开始");
		
		System.out.println("从第二项开始 凹坑瑕疵点 3个");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形 开始");
		add_flaw.click();
		
		ck3_wgbx.click();
		ck3_wgbx1.click();
		System.out.println("补缺1个   此时变形痕迹 还有2个 给第三个Tap");
		save_flaw.click();
		System.out.println("车头🚗4/5 第三Tap项");
		
		right_increase_button.click();
		plus_third_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从上回第三个选项变形的剩余的第二个开始");
		ck3_wgbx.click();
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();
		System.out.println("还差2个 从色差开始 ");
		
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个 4色差[1] 5生锈痕迹[3] 6修补痕迹[3] 7更换[1] 8水泡[1] 9破裂[1]  10丢件[1]  11晃动[1]  12板间间隙[1] 13灯组检测[2] 剩余的需要计数器给下个回合单独抽取跑  担心索引值改变 建议用UiSelector");
		System.out.println("🚗车头正视区域  4/5 ✅瑕疵点添加完毕！");
		System.out.println("第二轮🈶️");
		
		next_page.click();

	}
	public void  carFront5_5() {
		System.out.println("******🚗车头  5/5 车辆前底盘 瑕疵点******");
		System.out.println("1托底[1] 2滴漏[3] 3生锈痕迹[3] 4破裂[1] 5变形痕迹[3] 6铂金痕迹[4] 7更换[1]");
		
		System.out.println("从托底开始");
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_dply.click();
		ck3_dply1.click();
		add_flaw.click();
		
		ck3_dply2.click();
		add_flaw.click();
		
		ck3_dply3.click();
		save_flaw.click();
		System.out.println("第一Tap完成 ");
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 生锈痕迹 瑕疵点 3个 补破裂痕迹1个");
		
		ck3_dpxs.click();
		ck3_dpxs1.click();
		add_flaw.click();
		
		ck3_dpxs2.click();
		add_flaw.click();
		
		ck3_dpxs3.click();
		add_flaw.click();
		ck3_wgpl.click();
		ck3_wgpl1.click();
		
		save_flaw.click();
		System.out.println("第三项开始 变形3个");
		ck3_gjbx_1.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		add_flaw.click();
		System.out.println("3缺1  从铂金痕迹 补充1个");
		
		System.out.println("托底 滴漏  锈蚀痕迹 各自只有1个*****当前 已经到尾部子节点目录 后续没有 故而save瑕疵点 skip 2 3Tap 项 直接下一项");
		
		
		next_page.click();

	}
	
	public void leftFrontCarBody_1_17() {
		System.out.println("点击✅单个划伤 4个选项");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑瑕疵点 3个");
		//凹坑 瑕疵点
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前 凹坑 为3个 从下一个选项变形 开始");
		add_flaw.click();
		ck3_wgbx.click();
		ck3_wgbx1.click();
		System.out.println("补满当前个数4 个 剩余2个变形");
		save_flaw.click();
		
		System.out.println("第三个选项卡");
		right_increase_button.click();
		plus_third_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第三项开始 变形2个 色差2个 ");
		ck3_wgbx.click();
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		System.out.println("不足4个 从 色差开始 补2个色差瑕疵点");
		add_flaw.click();
		
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		
		save_flaw.click();
		System.out.println("✅4个瑕疵点添加 剩余1个色差等下下个回合点击");
		next_page.click();
		

		
	}
	public void leftFrontCarBody_2_17() {
		
		System.out.println("有2个子选项 1.轮胎异常[4]  2. 轮毂异常[3]");
		ck3_cllt.click();
		ck3_cllt1.click();
		add_flaw.click();
		ck3_cllt2.click();
		add_flaw.click();
		ck3_cllt3.click();
		add_flaw.click();
		ck3_cllt4.click();
		save_flaw.click();
		System.out.println("剩余轮毂异常 3个  给第二个Tap 使用 ");
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 轮毂异常3个  瑕疵点");
		
		ck3_cllg.click();
		
		ck3_cllg1.click();
		
		add_flaw.click();
		ck3_cllg2.click();
		add_flaw.click();
		
		ck3_cllg3.click();
		System.out.println("轮毂异常 当中只有3个 故而当前只点击三次 此轮已到尾部选项  无后续子Items  所以第三个Tap skip");
		
		save_flaw.click();
		
		next_page.click();

		
	}
	
	public void leftFrontCarBody_3_17() {
		
		System.out.println("1减震器漏油[1]  2 减震器胶套损坏[1]  3减震器变形[1]  均各自1个");
		ck3_jzly.click();
		ck3_jzly1.click();
		add_flaw.click();
		ck3_jzjt.click();
		ck3_jzjt1.click();
		add_flaw.click();
		
		ck3_zjbx.click();
		
		ck3_zjbx1.click();
		
		System.out.println("当前已经达到尾部  后续没有子选项 skip掉 2 3 Tap选项 直接点解下一项");
		
		save_flaw.click();
		next_page.click();

	}
	public void leftFrontCarBody_4_17() {
		//还是复用前面点 划伤 凹坑 变形 色差 模块
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑瑕疵点 3个");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项卡 变形 3个 开始");
		add_flaw.click();
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("✅ 中间项");
		
		System.out.println("第三个选项卡");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("从上轮循环补缺的 变形剩余2个  下一个开始");
        ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项卡 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个 剩余的需要计数器给下个回合单独抽取跑");
		System.out.println(" 左前车身  4/17 ✅瑕疵点添加完毕！");
		
		next_page.click();
		
		
	}
	
	public void leftFrontCarBody_5_17() {
		take_photo_start.click();
		
		click_shoot.click();
		save_photo.click();
		next_page.click();
		System.out.println("左前车身 5/17");
		
		
	}
	public void leftFrontCarBody_6_17() {
		take_photo_start.click();

		click_shoot.click();
		save_photo.click();
		next_page.click();
		System.out.println("左前车身 6/17");
		
	}
	
	public void leftFrontCarBody_7_17() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj.click();
		ck3_gjbj1.click();
		
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完成✅第一个 钣金痕迹 四次瑕疵点点击");
		
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("本轮第二个 变形痕迹3个");
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		add_flaw.click();
		System.out.println("还缺少一个 锈蚀补充1个 剩2个锈蚀");
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		System.out.println("✅中间项 开始第三个Tap");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环 的 锈蚀痕迹 2剩余3个 CK3_FHBXS  开始(默认会计算前一段 剩余几个 等下一次自带筛选在上次那个选项 )
		ck3_fhbxs2.click();
		add_flaw.click();
		
		ck3_fhbxs3.click();
		add_flaw.click();
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅当前选项   拆卸痕迹 还剩余1个  给 下个轮回点击");
		
		next_page.click();
		
		
	}
	public void leftFrontCarBody_8_17() {
		System.out.println("1污渍[3] 2磨损[3] 3变形[3] 4 塌陷[3] 5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		
		System.out.println("本轮污渍 3缺1 磨损替补1个 剩余2个");
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		System.out.println("2缺2  从变形补齐2个  变形3个");
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		System.out.println("中间项点击满 4个 变形1缺3 ***** 现在开始第三个Tap 项的瑕疵点");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("塌陷3个 满足！");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("左前车身🚗 8/17 ******左前车门内饰 瑕疵点添加完毕！");
		
		next_page.click();
	
	}
	public void leftFrontCarBody_9_17() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左A柱下部检测");
		
		next_page.click();
		
	}
	public void leftFrontCarBody_10_17() {
		
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左A柱上部检测");
		
		next_page.click();
		
	}
	public void leftFrontCarBody_11_17() {
		
		//左B柱
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左B柱");
		
		next_page.click();

	}
	public void leftFrontCarBody_12_17() {
		//左B柱
				System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7托底[1]");
				ck3_gjbj1.click();
				add_flaw.click();
				ck3_gjbj2.click();
				add_flaw.click();
				ck3_gjbj3.click();
				add_flaw.click();
				ck3_gjbj4.click();
				save_flaw.click();
				
				System.out.println("完毕第一项 第二项开始 ");
				right_increase_button.click();
				plus_middle_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_gjbx.click();
				ck3_gjbx1.click();
				add_flaw.click();
				ck3_gjbx2.click();
				add_flaw.click();
				ck3_gjbx3.click();
				System.out.println("3缺1  从锈蚀痕迹补充");
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs1.click();
				save_flaw.click();
				
				System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
				right_increase_button.click();
				plus_third_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs2.click();
				add_flaw.click();
				ck3_fhbxs3.click();
				add_flaw.click();
				System.out.println("拆卸痕迹补充2个");
				ck3_gjcx.click();
				ck3_gjcx1.click();
				add_flaw.click();
				ck3_gjcx2.click();
				save_flaw.click();
				System.out.println("✅左前车门裙边");
				
				next_page.click();

	}

	public void leftFrontCarBody_13_17() {
		System.out.println("变形异常点==============================================");
		System.out.println("1 污渍[3] 2磨损[3]  3变形[3]  4凹陷[3]  5破损[4] 6烧烫[2] 7丢件[1]  8水泡[3] 9晃动[1]");
//		CK3_NSWZ1
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		System.out.println("3缺1  从磨损 3抽一");
//		CK3_NSMS
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("开始第二个Tap 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		System.out.println("2缺2 从  变形3抽2");
		//变形 CK3_NSBX
		add_flaw.click();//注意添加 瑕疵点
		ck3_nsbx.click();
		System.out.println("================⚠变形开始第一个=================");
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("开始第三个Tap选项 变形剩余1个 1缺3"); //此时变形位置变了
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("开始从 凹陷3个补");
		
		ck3_nsox.click();
		ck3_nsox1.click();
		add_flaw.click();
		ck3_nsox2.click();
		add_flaw.click();
		ck3_nsox3.click();
		save_flaw.click();
		System.out.println("左前车身🚗***** 驾驶席区域✅当前的第三个Tap的瑕疵点添加 ");
		next_page.click();

	}
	
	public void leftFrontCarBody_14_17() {
		System.out.println("1 污渍[3] 2磨损[3]  3色差[3]  4塌陷[3]  5破损[4] 6烧烫[2] 7丢件[1]  8爆裂[1] 9晃动[1]");
		
//		CK3_NSWZ1
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		System.out.println("3缺1  从磨损 3抽一");
//		CK3_NSMS
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("开始第二个Tap 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		add_flaw.click();
		System.out.println("磨损 2缺2 从  色差3抽2");
		//变形 CK3_NSBX
		ck3_wwgsc_1.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("开始第三个Tap选项 色差剩余1个 1缺3");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_wwgsc_1.click();
		ck3_wwgsc3.click();
		add_flaw.click();
		System.out.println("开始从 塌陷3个补");
		
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("左前车身🚗***** 14/17方向盘 ✅当前的第三个Tap的瑕疵点添加 ");
		next_page.click();
	}
	public void leftFrontCarBody_15_17() {
		System.out.println("1 污渍[3] 2磨损[3]  3变形[3]  4塌陷[3]  5破损[4] 6烧烫[2] 7花屏[1]  8故障灯[1]");
//		CK3_NSWZ1
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		System.out.println("3缺1  从磨损 3抽一");
//		CK3_NSMS
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("开始第二个Tap 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("磨损剩余2缺2 从变形补");
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		save_flaw.click();
		
		System.out.println("开始第三个Tap选项 1缺3 塌陷3");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		
		next_page.click();
		
	}
	public void leftFrontCarBody_16_17() {
		System.out.println("1 污渍[3] 2磨损[3]  3变形[3]  4塌陷[3]  5破损[4] 6烧烫[2] 7丢件[1]  8功能键[1]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		System.out.println("3缺1  从磨损 3抽一");
//		CK3_NSMS
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("开始第二个Tap 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("磨损剩余2缺2 从变形补");

		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		add_flaw.click();//⚠添加 点击瑕疵点
		System.out.println("2缺2 从  变形3抽2");
		//变形 CK3_NSBX
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("开始第三个Tap选项 变形剩余1个 1缺3");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("开始从 塌陷3个补");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("16/17中控 ✅第三Tap 瑕疵点 添加");
		
		next_page.click();
		
	}
	public void leftFrontCarBody_17_17() {
		System.out.println("1 污渍[3] 2磨损[3]  3变形[3]  4塌陷[3]  5破损[4] 6烧烫[2] 7丢件[1]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		System.out.println("3缺1  从磨损 3抽一");
//		CK3_NSMS
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("开始第二个Tap 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("磨损剩余2缺2 从变形补");

		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		add_flaw.click();
		System.out.println("2缺2 从  变形3抽2");
		//变形 CK3_NSBX
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("开始第三个Tap选项 变形剩余1个 1缺3");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("开始从 塌陷3个补");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("17/17中控 ✅第三Tap 瑕疵点 添加");
		next_page.click();
		
	}
//	Engine compartment
	public void engine_compartment_2_18() {
		System.out.println("发动机盖内侧 ");
		ck3_gjbj.click();
		ck3_gjbj1.click();
		
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完成✅第一个 钣金痕迹 四次瑕疵点点击");
		
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("本轮第二个 变形痕迹3个");
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		add_flaw.click();
		System.out.println("还缺少一个 锈蚀补充1个 剩2个锈蚀");
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("✅中间项 开始第三个Tap");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环 的 锈蚀痕迹 2剩余3个 CK3_FHBXS  开始(默认会计算前一段 剩余几个 等下一次自带筛选在上次那个选项 )
		ck3_fhbxs2.click();
		add_flaw.click();
		
		ck3_fhbxs3.click();
		add_flaw.click();
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		System.out.println("✅当前选项   拆卸痕迹 还剩余2个  给 下个轮回点击");
		
		save_flaw.click();
		System.out.println("剩余的＊＊＊＊＊");
		next_page.click();
		
	}
	public void engine_compartment_3_18() {
		
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅发动机盖左侧铰链 瑕疵点完毕！");
		
		next_page.click();

		
	}
	public void engine_compartment_4_18() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		
		System.out.println("✅左侧减震器支架 瑕疵点完毕！");
		
		next_page.click();

	}
	
	public void engine_compartment_5_18() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6更换[1] 7破损[4]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("水泡 更换 合一起补充2个");
		ck3_spjc.click();
		ck3_spjc1.click();
		add_flaw.click();
		
		ck3_wggh_1.click();
		ck3_wggh1.click();
		save_flaw.click();
		
		
		
		System.out.println("✅左侧发动机翼子板架 瑕疵点完毕！");
		
		next_page.click();
		
		
	}
	public void engine_compartment_6_18() {
		System.out.println("**********************重点Driver 实效点*********************************");
		
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6破损[4] 7更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();//上回Driver 异常退出点
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅左侧水箱框架 瑕疵点完毕！");
		
		next_page.click();

	}
	
	public void engine_compartment_7_18() {
		//同 4/18
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅ 左前梁头 瑕疵点完毕！");
		
		next_page.click();

	}
	public void engine_compartment_8_18() {
		
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6破损[4] 7更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅水箱框架 瑕疵点完毕！");
		
		next_page.click();
		
	}
	public void engine_compartment_9_18() {
		//同 4/18
				System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1] 6托底[1]");
				ck3_gjbj1.click();
				add_flaw.click();
				ck3_gjbj2.click();
				add_flaw.click();
				ck3_gjbj3.click();
				add_flaw.click();
				ck3_gjbj4.click();
				save_flaw.click();
				
				System.out.println("完毕第一项 第二项变形痕迹 开始 ");
				right_increase_button.click();
				plus_middle_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_gjbx.click();
				ck3_gjbx1.click();
				add_flaw.click();
				ck3_gjbx2.click();
				add_flaw.click();
				ck3_gjbx3.click();
				System.out.println("3缺1  从锈蚀痕迹补充");
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs1.click();
				save_flaw.click();
				
				System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
				right_increase_button.click();
				plus_third_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs2.click();
				add_flaw.click();
				ck3_fhbxs3.click();
				add_flaw.click();
				System.out.println("拆卸痕迹补充2个");
				ck3_gjcx.click();
				ck3_gjcx1.click();
				add_flaw.click();
				ck3_gjcx2.click();
				save_flaw.click();
				System.out.println("✅ 左前梁头 瑕疵点完毕！");
				
				next_page.click();

	}
	public void engine_compartment_10_18() {
		//同 4/18
				System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1]");
				ck3_gjbj1.click();
				add_flaw.click();
				ck3_gjbj2.click();
				add_flaw.click();
				ck3_gjbj3.click();
				add_flaw.click();
				ck3_gjbj4.click();
				save_flaw.click();
				
				System.out.println("完毕第一项 第二项开始 ");
				right_increase_button.click();
				plus_middle_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_gjbx.click();
				ck3_gjbx1.click();
				add_flaw.click();
				ck3_gjbx2.click();
				add_flaw.click();
				ck3_gjbx3.click();
				System.out.println("3缺1  从锈蚀痕迹补充");
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs1.click();
				save_flaw.click();
				
				System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
				right_increase_button.click();
				plus_third_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs2.click();
				add_flaw.click();
				ck3_fhbxs3.click();
				add_flaw.click();
				System.out.println("拆卸痕迹补充2个");
				ck3_gjcx.click();
				ck3_gjcx1.click();
				add_flaw.click();
				ck3_gjcx2.click();
				save_flaw.click();
				System.out.println("✅ 左前梁头 瑕疵点完毕！");
				
				next_page.click();

	}
	public void engine_compartment_11_18() {
		//同  8/18
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6破损[4] 7更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅水箱框架 瑕疵点完毕！");
		
		next_page.click();
		
	}
	public void engine_compartment_12_18() {
		
		//右侧减震器支架
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("剩余1个 拆卸痕迹和1个 更换✅右侧减震器支架 瑕疵点完毕！");
		
		next_page.click();

		
	}
	
	public void engine_compartment_13_18() {
		
		//同  8/18
				System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6更换[1] 7破损[4]");
				ck3_gjbj1.click();
				add_flaw.click();
				ck3_gjbj2.click();
				add_flaw.click();
				ck3_gjbj3.click();
				add_flaw.click();
				ck3_gjbj4.click();
				save_flaw.click();
				System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
				right_increase_button.click();
				plus_middle_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_gjbx.click();
				ck3_gjbx1.click();
				add_flaw.click();
				ck3_gjbx2.click();
				add_flaw.click();
				ck3_gjbx3.click();
				System.out.println("3缺1  从锈蚀痕迹补充");
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs1.click();
				save_flaw.click();
				
				System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
				right_increase_button.click();
				plus_third_button.click();
				click_shoot.click();
				add_flaw.click();
				ck3_fhbxs.click();
				ck3_fhbxs2.click();
				add_flaw.click();
				ck3_fhbxs3.click();
				add_flaw.click();
				System.out.println("拆卸痕迹补充2个");
				ck3_gjcx.click();
				ck3_gjcx1.click();
				add_flaw.click();
				
				ck3_gjcx2.click();
				save_flaw.click();

				System.out.println("✅右侧发动机翼子板架  瑕疵点完毕！");
				
				next_page.click();
		
	}
	public void engine_compartment_14_18() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("剩余一个拆卸痕迹 ✅发动机盖右侧铰链  瑕疵点完毕！");
		
		next_page.click();

		
	}
	public void engine_compartment_15_18() {

		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4凹坑[3] 5更换[1] 6水泡[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("凹坑补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("剩余一个凹坑 1个更换 1个水泡 ✅发动机舱 防火板  瑕疵点完毕！");
		
		next_page.click();
		
	}
	public void engine_compartment_16_18() {
		
		System.out.println("1.锈蚀不清 2缺损 3事故变形 4篡改嫌疑");
		ck3_cjxs.click();
		ck3_cjxs1.click();
		add_flaw.click();
		
		ck3_cjqs.click();
		ck3_cjqs1.click();
		add_flaw.click();
		
		ck3_cjsg.click();
		ck3_cjsg1.click();
		add_flaw.click();
		
		
		ck3_cjcg.click();
		ck3_cjcg1.click();
		save_flaw.click();
		next_page.click();
		System.out.println("车架号 16/18🚗 ✅车架号全部瑕疵点点击  刚好满4个");

	}
	public void engine_compartment_17_18() {
		
		oil_check.click();
		antifreeze_check.click();
		brake_fluid_check.click();
		boost_oil_check.click();
//		next_page.click();
		engine_17_18_savetonext.click();
//		native content: "By.AndroidUIAutomator: new UiSelector().resourceId("com.youxinpai.checkauto.act:id/tv_last_page")" 
//		com.youxinpai.checkauto.act:id/tv_last_page
		
	}
	public void engine_compartment_18_18() {
		System.out.println("开始执行18/18的相机📷初始化🐣");
		shoot18_18.click();
		click_shoot.click();
		save_photo.click();
		edit_mile.sendKeys("30");
//		driver.hideKeyboard();
//		add_configuration.click();
		next_page.click();

	}
	public void transmission_1_1() {
		start_check.click();
		engine_check.click();
		turn_check.click();
		smoke.click();
		operation.click();
		abnormal_sound.click();
		shaking.click();
		electric.click();
		road_test.click();
		speedbox.click();
		save_tonext.click();
	
	}
	
	public void  left_rear_car_1_13() {
		System.out.println(" 左后车身1/13");
		
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("车头🚗2/5 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 破裂1个 玻璃检查4个 更换1个   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("🚗车头  2/5 ✅发动机盖 瑕疵点添加完毕!");
		
		next_page.click();
		
	}
	public void  left_rear_car_2_13() {
		System.out.println("后排座椅");
		take_photo.click();
		click_camera.click();
		
		save_photo.click();
		next_page.click();
		
	}
	public void left_rear_car_3_13() {
		System.out.println("1钣金痕迹 2变形痕迹 3锈蚀痕迹 4拆卸痕迹");
		ck3_gjbj.click();
		ck3_gjbj1.click();
		
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完成✅第一个 钣金痕迹 四次瑕疵点点击");
		
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("本轮第二个 变形痕迹3个");
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		add_flaw.click();
		System.out.println("还缺少一个 锈蚀补充1个 剩2个锈蚀");
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		System.out.println("✅中间项 开始第三个Tap");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("从上轮循环 的 锈蚀痕迹 2 剩余3个拆卸痕迹 CK3_FHBXS  开始(默认会计算前一段 剩余几个 等下一次自带筛选在上次那个选项 )");
		ck3_fhbxs2.click();
		add_flaw.click();
		
		ck3_fhbxs3.click();
		add_flaw.click();
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅当前选项   拆卸痕迹 还剩余1个  给 下个轮回点击");
		
		next_page.click();

	}
	
	public void left_rear_car_4_13() {
		System.out.println("同7/18");
		System.out.println("1污渍[3] 2磨损[3] 3变形[3] 4 塌陷[3] 5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		
		System.out.println("本轮污渍 3缺1 磨损替补1个 剩余2个");
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		add_flaw.click();
		System.out.println("2缺2  从变形补齐2个  变形3个");
		
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("中间项点击满 4个 变形1缺3 ***** 现在开始第三个Tap 项的瑕疵点");
		
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("塌陷3个 满足！");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("左前车身🚗 8/17 ******左前车门内饰 瑕疵点添加完毕！ 剩余5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]");
		
		next_page.click();
		
	}
	public void left_rear_car_5_13() {
		System.out.println("左B柱铰链");
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左A柱上部检测");
		
		next_page.click();
		
	}
	public void left_rear_car_6_13() {
		System.out.println("左C柱上部");
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左A柱上部检测");
		
		next_page.click();
		
	}
	public void  left_rear_car_7_13() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左A柱上部检测");
		
		next_page.click();
		
	}
	public void left_rear_car_8_13() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7托底[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅左A柱上部检测完毕！ 剩余 拆卸痕迹1个 划伤4个 凹坑 3个  托底1个");
		
		next_page.click();
		
	}
	
	public void left_rear_car_9_13() {
		System.out.println("仪表台");
		//注意是否已经点击 初始化掉按钮
		take_photo.click();
		click_camera.click();
		
		save_photo.click();
		next_page.click();
		
	}
	public void left_rear_car_10_13() {
		
		System.out.println("同7/18");
		System.out.println("1污渍[3] 2磨损[3] 3变形[3] 4 塌陷[3] 5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[3]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		
		System.out.println("本轮污渍 3缺1 磨损替补1个 剩余2个");
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		add_flaw.click();
		System.out.println("2缺2  从变形补齐2个  变形3个");
		
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("中间项点击满 4个 变形1缺3 ***** 现在开始第三个Tap 项的瑕疵点");
		
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("塌陷3个 满足！");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("左前车身🚗 8/17 ******左前车门内饰 瑕疵点添加完毕！ 剩余5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[3]");
		
		next_page.click();
		
	}
	public void left_rear_car_11_13() {
		
		System.out.println(" 左后车身1/13");
		System.out.println("划伤[4]  凹坑[3] 变形[3] 色差[3] 锈蚀痕迹[3] 修补痕迹[3] 更换[1] 丢件[1]  破裂[1]");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("车头🚗2/5 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 更换1个 丢件1个 破裂1个   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("🚗车头  2/5 ✅发动机盖 瑕疵点添加完毕!");
		
		next_page.click();
		
	}
	
	public void left_rear_car_12_13() {
		
		System.out.println("有2个子选项 1.轮胎异常[4]  2. 轮毂异常[3]");
		ck3_cllt.click();
		ck3_cllt1.click();
		add_flaw.click();
		ck3_cllt2.click();
		add_flaw.click();
		ck3_cllt3.click();
		add_flaw.click();
		ck3_cllt4.click();
		save_flaw.click();
		System.out.println("剩余轮毂异常 3个  给第二个Tap 使用 ");
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 轮毂异常3个  瑕疵点");
		
		ck3_cllg.click();
		
		ck3_cllg1.click();
		
		add_flaw.click();
		ck3_cllg2.click();
		add_flaw.click();
		
		ck3_cllg3.click();
		System.out.println("轮毂异常 当中只有3个 故而当前只点击三次 此轮已到尾部选项  无后续子Items  所以第三个Tap skip");
		
		save_flaw.click();
		
		next_page.click();

	}
	public void left_rear_car_13_13() {
		System.out.println("1减震器漏油  2 减震器胶套损坏  3减震器变形  均各自1个");
		ck3_jzly.click();
		ck3_jzly1.click();
		add_flaw.click();
		ck3_jzjt.click();
		ck3_jzjt1.click();
		add_flaw.click();
		
		ck3_zjbx.click();
		
		ck3_zjbx1.click();
		
		System.out.println("当前已经达到尾部  后续没有子选项 skip掉 2 3 Tap选项 直接点解下一项");
		
		save_flaw.click();
		next_page.click();
		
	}
	
	public void left_rear_car_1_14() {
		
		System.out.println("1玻璃检查[4] 2 更换[1]");
		ck3_bl.click();
		ck3_bl1.click();
		add_flaw.click();
		ck3_bl2.click();
		add_flaw.click();
		ck3_bl3.click();
		add_flaw.click();
		ck3_bl4.click();
		save_flaw.click();
		System.out.println("玻璃检查4个瑕疵点点满 下一轮 中间项");
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 更换1个瑕疵点");
		
		ck3_wggh.click();
		System.out.println("当前选项只有一个 后续需要补充3个 但是已经没有子选项  故而此轮放弃满足4个需求***需求是点满为止 不多不少 所以第三个子Tap也是skip");
		ck3_wggh1.click();
		
		save_flaw.click();
		
		System.out.println("✅后备箱 后风挡玻璃 1/14的检测完毕 直接点击下一项");
		
		next_page.click();
	
	}
	public void left_rear_car_2_14() {
		
		System.out.println("划伤[4]  凹坑[3] 变形[3] 色差[3] 锈蚀痕迹[3] 修补痕迹[3] 破裂[1] 掉漆[3] 丢件[1]  ");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("后备箱盖 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 破裂1个 掉漆3个 丢件1个    剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("后备箱盖 ✅ 瑕疵点添加完毕!");
		
		next_page.click();

	}
	
	public void left_rear_car_3_14() {
		System.out.println("划伤[4]  凹坑[3] 变形[3] 色差[3] 锈蚀痕迹[3] 修补痕迹[3] 更换[1] 水泡[1] 丢件[1]  破裂[1]");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("后备箱 车尾正视区域 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 更换1个 水泡1个 丢件1个 破裂1个    剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("后备箱 车尾正视区域 ✅ 瑕疵点添加完毕!");
		
		next_page.click();
		
	}
	public void left_rear_car_4_14() {
		take_photo.click();
		click_camera.click();
		
		save_photo.click();
		next_page.click();
		
	}
	public void left_rear_car_5_14() {
		
		spare_tire.click();
		tools.click();
		save_tonext.click();
	
	}
	
	public void left_rear_car_6_14() {
		
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6破损[4] 7更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅ 瑕疵点完毕！拆卸痕迹还剩1个  水泡1个 破损4个 污渍3个");
		
		next_page.click();
		
	}
	
	public void left_rear_car_7_14() {
		System.out.println("后备箱🚗7/14 ******后备箱盖内部");
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1] 6破裂[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹3个  补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅左侧发动机翼子板架 瑕疵点完毕！");
		
		next_page.click();

	}
	public void left_rear_car_8_14() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅后备箱左铰链 瑕疵点完毕！");
		
		next_page.click();

	}
	public void left_rear_car_9_14() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅ 瑕疵点完毕！拆卸痕迹还剩1个  水泡1个 更换1个");
		
		next_page.click();

	}
	
	public void left_rear_car_10_14() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅ 瑕疵点完毕！拆卸痕迹还剩1个 更换1个");
		
		next_page.click();
		
	}
	public void left_rear_car_11_14() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅ 瑕疵点完毕！拆卸痕迹还剩1个  水泡1个 更换1个");
		
		next_page.click();
	}
	public void left_rear_car_12_14() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5水泡[1] 6更换[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完毕第一项 第二项开始  变形痕迹3 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		
		ck3_gjcx2.click();
		save_flaw.click();

		System.out.println("✅ 瑕疵点完毕！拆卸痕迹还剩1个  水泡1个 更换1个");
		
		next_page.click();
		
	}
	public void left_rear_car_13_14() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅发动机盖左侧铰链 瑕疵点完毕！");
		
		next_page.click();
		
	}
	public void left_rear_car_14_14() {
		System.out.println("1托底[1]  2滴漏[1] 3锈蚀痕迹[1] 4排气管锈裂[1]");
		ck3_dptd.click();
		ck3_dptd1.click();
		add_flaw.click();
		
		ck3_dply.click();
		ck3_dply1.click();
		add_flaw.click();
		
		ck3_dpxs.click();
		ck3_dpxs1.click();
		add_flaw.click();
		
		ck3_dpxl.click();
		ck3_dpxl1.click();
		save_flaw.click();
		
		System.out.println("托底 滴漏  锈蚀痕迹 排气管锈裂 各自只有1个  共4个 满足 直接skip 后面的2 3 选项卡 ");
	
		next_page.click();
		
	}
	public void right_rear_car_1_11() {
		
		take_photo.click();
		click_camera.click();
		
		save_photo.click();
		next_page.click();
	}
	
	public void right_rear_car_2_11() {
		System.out.println(" 左后车身1/13");
		System.out.println("划伤[4]  凹坑[3] 变形[3] 色差[3] 锈蚀痕迹[3] 修补痕迹[3] 更换[1] 丢件[1]  破裂[1]");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("车头🚗2/5 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 更换1个 丢件1个 破裂1个   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("🚗车头  2/5 ✅发动机盖 瑕疵点添加完毕!");
		
		next_page.click();
		
	}
	public void right_rear_car_3_11() {
		System.out.println("有2个子选项 1.轮胎异常[4]  2. 轮毂异常[3]");
		ck3_cllt.click();
		ck3_cllt1.click();
		add_flaw.click();
		ck3_cllt2.click();
		add_flaw.click();
		ck3_cllt3.click();
		add_flaw.click();
		ck3_cllt4.click();
		save_flaw.click();
		System.out.println("剩余轮毂异常 3个  给第二个Tap 使用 ");
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 轮毂异常3个  瑕疵点");
		
		ck3_cllg.click();
		
		ck3_cllg1.click();
		
		add_flaw.click();
		ck3_cllg2.click();
		add_flaw.click();
		
		ck3_cllg3.click();
		System.out.println("轮毂异常 当中只有3个 故而当前只点击三次 此轮已到尾部选项  无后续子Items  所以第三个Tap skip");
		
		save_flaw.click();
		
		next_page.click();
		
	}
	
	public void right_rear_car_4_11() {
		System.out.println("1减震器漏油[1]  2 减震器胶套损坏[1]  3减震器变形[1]");
		ck3_jzly.click();
		ck3_jzly1.click();
		add_flaw.click();
		ck3_jzjt.click();
		ck3_jzjt1.click();
		add_flaw.click();
		
		ck3_zjbx.click();
		
		ck3_zjbx1.click();
		
		System.out.println("当前已经达到尾部  后续没有子选项 skip掉 2 3 Tap选项 直接点解下一项");
		
		save_flaw.click();
		next_page.click();
		
	}
	public void right_rear_car_5_11() {
		
		System.out.println("1划伤[4] 2凹坑[3] 3变形[3] 4色差[3] 5锈蚀痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[4] 9更换[1] ");
		
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("右后车门5/11 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 破裂1个 玻璃检查4个 更换1个   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("右后车身5/11 ✅右后车门 瑕疵点添加完毕!");
		
		next_page.click();
		
	}
	public void right_rear_car_6_11() {
		
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅拆卸痕迹还剩1个 瑕疵点完毕！");
		
		next_page.click();
	}
	public void right_rear_car_7_11() {
		System.out.println("------------------------------------------");
		System.out.println("1污渍[3] 2磨损[3] 3变形[3] 4 塌陷[3] 5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		
		System.out.println("本轮污渍 3缺1 磨损替补1个 剩余2个");
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		System.out.println("2缺2  从变形补齐2个  变形3个");
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		System.out.println("中间项点击满 4个 变形1缺3 ***** 现在开始第三个Tap 项的瑕疵点");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("塌陷3个 满足！");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("右后车身🚗7/11  剩余5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]******右后车门内饰 瑕疵点添加完毕！");
		
		next_page.click();
		
	}
	public void right_rear_car_8_11() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("右后车身🚗8/11 ******右B柱铰链✅ 剩余 拆卸痕迹1个  划伤4个 凹坑3个 更换1个 修补痕迹3个");
		
		next_page.click();
		
	}
	public void right_rear_car_9_11() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("右后车身🚗8/11 ******右B柱铰链✅ 剩余 拆卸痕迹1个  划伤4个 凹坑3个 更换1个 修补痕迹3个");
		
		next_page.click();
	}
	
	public void right_rear_car_10_11() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("右后车身🚗8/11 ******右B柱铰链✅ 剩余 拆卸痕迹1个  划伤4个 凹坑3个 更换1个 修补痕迹3个");
		
		next_page.click();
	}
	public void right_rear_car_11_11() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7托底[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅右后车身🚗11/11 ******右后车门裙边 剩余 4拆卸痕迹[1] 5划伤[4] 6凹坑[3] 7托底[1]");
		
		next_page.click();
	}
	public void right_front_car_1_12() {
    System.out.println("1划伤[4] 2凹坑[3] 3变形[3] 4色差[3] 5锈蚀痕迹[3] 6修补痕迹[3] 7破裂[1] 8玻璃检查[4] 9更换[1] ");
		
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("右后车门5/11 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 破裂1个 玻璃检查4个 更换1个   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("右前车身🚗1/12 ******右前车门✅ 瑕疵点添加完毕!");
		
		next_page.click();
		
	}
	public void right_front_car_2_12() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3]");
		ck3_gjbj.click();
		ck3_gjbj1.click();
		
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		System.out.println("完成✅第一个 钣金痕迹 四次瑕疵点点击");
		
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		System.out.println("本轮第二个 变形痕迹3个");
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		add_flaw.click();
		System.out.println("还缺少一个 锈蚀补充1个 剩2个锈蚀");
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		System.out.println("✅中间项 开始第三个Tap");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环 的 锈蚀痕迹 2剩余3个 CK3_FHBXS  开始(默认会计算前一段 剩余几个 等下一次自带筛选在上次那个选项 )
		ck3_fhbxs2.click();
		add_flaw.click();
		
		ck3_fhbxs3.click();
		add_flaw.click();
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅当前选项   拆卸痕迹 还剩余1个  给 下个轮回点击");
		
		next_page.click();
		
	}
	public void right_front_car_3_12() {
		System.out.println("1污渍[3] 2磨损[3] 3变形[3] 4 塌陷[3] 5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		
		System.out.println("本轮污渍 3缺1 磨损替补1个 剩余2个");
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		System.out.println("2缺2  从变形补齐2个  变形3个");
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		System.out.println("中间项点击满 4个 变形1缺3 ***** 现在开始第三个Tap 项的瑕疵点");
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("塌陷3个 满足！");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("右前车身🚗3/12 ******右前车门内饰 瑕疵点添加完毕！ 剩余 5破损[4] 6烧烫[2] 7丢件[1] 8 水泡[2]");
		
		next_page.click();
		
	}
	public void right_front_car_4_12() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅右前车身🚗4/12 ******右A柱下部  4拆卸痕迹[1] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]  ");
		
		next_page.click();
	}
	public void right_front_car_5_12() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅右前车身🚗5/12 ******右A柱上部  4拆卸痕迹[1] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]  ");
		
		next_page.click();
	}
	public void right_front_car_6_12() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅右前车身🚗6/12 ******右B柱  4拆卸痕迹[1] 5划伤[4] 6凹坑[3] 7更换[1] 8 修补痕迹[3]  ");
		
		next_page.click();
	}
	
	public void right_front_car_7_12() {
		System.out.println("1钣金痕迹[4] 2变形痕迹[3] 3锈蚀痕迹[3] 4拆卸痕迹[3] 5划伤[4] 6凹坑[3] 7托底[1]");
		ck3_gjbj1.click();
		add_flaw.click();
		ck3_gjbj2.click();
		add_flaw.click();
		ck3_gjbj3.click();
		add_flaw.click();
		ck3_gjbj4.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 ");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_gjbx.click();
		ck3_gjbx1.click();
		add_flaw.click();
		ck3_gjbx2.click();
		add_flaw.click();
		ck3_gjbx3.click();
		System.out.println("3缺1  从锈蚀痕迹补充");
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs1.click();
		save_flaw.click();
		
		System.out.println("第三 选项卡开始点击 锈蚀痕迹剩余2个");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_fhbxs.click();
		ck3_fhbxs2.click();
		add_flaw.click();
		ck3_fhbxs3.click();
		add_flaw.click();
		System.out.println("拆卸痕迹补充2个");
		ck3_gjcx.click();
		ck3_gjcx1.click();
		add_flaw.click();
		ck3_gjcx2.click();
		save_flaw.click();
		System.out.println("✅右前车身🚗7/12 ******右前车门裙边");
		
		next_page.click();
	}
	public void right_front_car_8_12() {
		System.out.println("变形异常点==============================================");
		System.out.println("1 污渍[3] 2磨损[3]  3变形[3]  4凹陷[3]  5破损[4] 6烧烫[2] 7丢件[1]  8水泡[3] 9晃动[1]");
//		CK3_NSWZ1
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		System.out.println("3缺1  从磨损 3抽一");
//		CK3_NSMS
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("开始第二个Tap 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		System.out.println("2缺2 从  变形3抽2");
		//变形 CK3_NSBX
		add_flaw.click();//注意添加 瑕疵点
		ck3_nsbx.click();
		System.out.println("================⚠变形开始第一个=================");
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("开始第三个Tap选项 变形剩余1个 1缺3"); //此时变形位置变了
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("开始从 凹陷3个补");
		
		ck3_nsox.click();
		ck3_nsox1.click();
		add_flaw.click();
		ck3_nsox2.click();
		add_flaw.click();
		ck3_nsox3.click();
		save_flaw.click();
		System.out.println("右前车身🚗8/12 ******副驾驶席区域  剩余 5破损[4] 6烧烫[2] 7丢件[1]  8水泡[3] 9晃动[1]");
		next_page.click();
		
	}
	public void right_front_car_9_12() {
		System.out.println("同7/18");
		System.out.println("1污渍[3] 2磨损[3] 3变形[3] 4 塌陷[3] 5破损[4] 6烧烫[2] 7丢件[1] 8 更换[1] 9下垂[1]");
		ck3_nswz1.click();
		add_flaw.click();
		ck3_nswz2.click();
		add_flaw.click();
		ck3_nswz3.click();
		add_flaw.click();
		
		System.out.println("本轮污渍 3缺1 磨损替补1个 剩余2个");
		ck3_nsms.click();
		ck3_nsms1.click();
		save_flaw.click();
		
		System.out.println("完毕第一项 第二项开始 磨损剩余2个");
		right_increase_button.click();
		plus_middle_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsms.click();
		ck3_nsms2.click();
		add_flaw.click();
		ck3_nsms3.click();
		add_flaw.click();
		System.out.println("2缺2  从变形补齐2个  变形3个");
		
		ck3_nsbx.click();
		ck3_nsbx1.click();
		add_flaw.click();
		ck3_nsbx2.click();
		save_flaw.click();
		
		System.out.println("中间项点击满 4个 变形1缺3 ***** 现在开始第三个Tap 项的瑕疵点");
		
		
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		ck3_nsbx.click();
		ck3_nsbx3.click();
		add_flaw.click();
		System.out.println("塌陷3个 满足！");
		ck3_nstx.click();
		ck3_nstx1.click();
		add_flaw.click();
		ck3_nstx2.click();
		add_flaw.click();
		ck3_nstx3.click();
		save_flaw.click();
		System.out.println("右前车身🚗9/12 ******车顶内饰 瑕疵点添加完毕！ 剩余 5破损[4] 6烧烫[2] 7丢件[1] 8 更换[1] 9下垂[1]");
		
		next_page.click();
	}
	
	public void right_front_car_10_12() {
		System.out.println(" 左后车身1/13");
		System.out.println("划伤[4]  凹坑[3] 变形[3] 色差[3] 锈蚀痕迹[3] 修补痕迹[3] 更换[1] 丢件[1]  破裂[1]");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("车头🚗2/5 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅4个 还有第四项 色差 剩余1个  锈蚀痕迹3个 修补痕迹3个 更换1个 丢件1个 破裂1个   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("右前车身🚗10/12 ******右前翼子板✅ 瑕疵点添加完毕! 剩余");
		
		next_page.click();
	}
	public void right_front_car_11_12() {
		System.out.println("有2个子选项 1.轮胎异常[4]  2. 轮毂异常[3]");
		ck3_cllt.click();
		ck3_cllt1.click();
		add_flaw.click();
		ck3_cllt2.click();
		add_flaw.click();
		ck3_cllt3.click();
		add_flaw.click();
		ck3_cllt4.click();
		save_flaw.click();
		System.out.println("剩余轮毂异常 3个  给第二个Tap 使用 ");
		
		System.out.println("第二个选项卡");
		right_increase_button.click();
        plus_middle_button.click();
		
        click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 轮毂异常3个  瑕疵点");
		
		ck3_cllg.click();
		
		ck3_cllg1.click();
		
		add_flaw.click();
		ck3_cllg2.click();
		add_flaw.click();
		
		ck3_cllg3.click();
		System.out.println("轮毂异常 当中只有3个 故而当前只点击三次 此轮已到尾部选项  无后续子Items  所以第三个Tap skip");
		
		save_flaw.click();
		
		next_page.click();
		
	}
	public void right_front_car_12_12() {
		System.out.println("1减震器漏油[1]  2 减震器胶套损坏[1]  3减震器变形[1]  均各自1个");
		ck3_jzly.click();
		ck3_jzly1.click();
		add_flaw.click();
		ck3_jzjt.click();
		ck3_jzjt1.click();
		add_flaw.click();
		
		ck3_zjbx.click();
		
		ck3_zjbx1.click();
		
		System.out.println("当前已经达到尾部  后续没有子选项 skip掉 2 3 Tap选项 直接点解下一项");
		
		save_flaw.click();
		next_page.click();

	}
	public void roof_car_1_1() {
		
		System.out.println("划伤[4]  凹坑[3] 变形[3] 色差[3] 锈蚀痕迹[3] 修补痕迹[3] 更换[1] 安装孔[1]  天窗[2]");
		System.out.println("第一次 划伤 4个选项点满");
		huashang.click();
		ck3_wghs1.click();
		add_flaw.click();
		ck3_wghs2.click();
		
		add_flaw.click();
		ck3_wghs3.click();
		add_flaw.click();
		ck3_wghs4.click();
		save_flaw.click();
		
		System.out.println("第二个选项卡*****中间项");
		right_increase_button.click();
		plus_middle_button.click();
		
		click_shoot.click();
		add_flaw.click();
		System.out.println("从第二项开始 凹坑 3个瑕疵点");
		ck3_wgak.click();
		ck3_wgak1.click();
		add_flaw.click();
		ck3_wgak2.click();
		add_flaw.click();
		ck3_wgak3.click();
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为3个 从下一个选项 变形(变形🈶3个) 开始");
		add_flaw.click();
		
		
		ck3_wgbx.click();
		ck3_wgbx1.click();//补缺1个 
		save_flaw.click();
		System.out.println("车顶🚗1/1 中间项*****点满瑕疵点");
		
		System.out.println("第三个选项卡***** 变形剩余2个瑕疵点");
		right_increase_button.click();
		plus_third_button.click();
		click_shoot.click();
		add_flaw.click();
		//从上轮循环补缺的下一个开始
		ck3_wgbx.click();
		
		ck3_wgbx2.click();
		add_flaw.click();
		ck3_wgbx3.click();
		add_flaw.click();//满2个 还需要2个
		System.out.println("此时需要判定当前的子选项是否为4个  不为4个的则需要从另一个子选项开始  目前为2个 从第四个选项 色差 开始");
		ck3_wwgsc.click();
		ck3_wwgsc1.click();
		add_flaw.click();
		ck3_wwgsc2.click();
		save_flaw.click();
		System.out.println("✅剩余 色差[1] 锈蚀痕迹[3] 修补痕迹[3] 更换[1] 安装孔[1]  天窗[2]   剩余的需要计数器给下个回合单独抽取跑");
		System.out.println("车顶🚗1/1 ✅ 瑕疵点添加完毕!");
		
		next_page.click();
		
		
	}
	public void re_equip_instructions() {
		whether_modification.click();
		save_tonext.click();
		
	}
	public void optionpaint() {
		paint_repair_hisory.click();
		partial_paint.click();
		
		currentstate_paint.click();
		general_quality.click();
		repair_decribe.click();
		repair_part.click();
		car_describe.sendKeys("QA Test");
		
		save_tonext.click();
		
	}
	public void comprehensive_condition_ratings_1_1() {
		comprehensive_condition_ratings.click();
		System.out.println("滑动屏幕页面");
		driver.scrollTo("维护成本评级");
		maintenance_costs_ratings.click();
		save_tonext.click();
		
	}
	public void  basicInfo() {
		basic_info_2.click();
		
		
	}
	
	public void headBack(){
		head_back.click();
		
	}
	

	
	
	
	
	
	
		
		
		

}
