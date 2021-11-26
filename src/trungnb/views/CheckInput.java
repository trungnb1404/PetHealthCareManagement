/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trungnb.views;

/**
 *
 * @author PC
 */
public class CheckInput {
    public static String checkID(String id){
        if(id.isEmpty()) return "ID can not null\n";
        if(id.contains("   ")) return "ID can not have more than 3 blank\n";
        if(id.length()>10) return "ID max length is 10 charaters.\n";
        String formatID = "^[a-zA-Z0-9\\s]+";
        if(!id.matches(formatID)) return "ID can not have special characters\n";
        return "";
    }
   
   public static String checkName(String name){
        if(name.isEmpty()) return "Name can not null\n";
        if(name.contains("   ")) return "Name can not have more than 3 blank\n";
        if(name.length()>50) return "Name max length is 50 characters\n";
        String formatName = "^[a-zA-Z\\s]+";
        if(!name.matches(formatName)) return "Name can not have numbers\n";
        return "";
    }

    public static String checkEmail(String Email) {
        if(Email.isEmpty()) return "Email can not null\n";
        if(Email.contains("   ")) return "Email can not have more than 3 blank\n";
        if(Email.length()>50) return "Email max length is 50 characters\n";
        String formatEmail = "\\w+@\\w+[.]\\w+";
        if(!Email.matches(formatEmail)) return "Email must have format xxx@xxx.xxx\n";
        return "";
       
    }

    public static String checkPhone(String phone){
        String formatPrice = "\\d{10,11}";
        if(phone.isEmpty()) return "Phone can not null\n";
        if(phone.contains("   ")) return "Phone can not have more than 3 blank\n";
        if(!phone.matches(formatPrice)) return "Phone is wrong (Must be 10-11 numbers )\n";
        return "";
    }
    
    public static String checkNumOfPet(String num){
        String formatPrice = "\\d[0-9]{0,999}";
        if(num.isEmpty()) return "Num Of Pet can not null\n";
        if(Integer.parseInt(num) < 0) return "Num Of Pet must be > 0\n";
        if(num.contains("   ")) return "Num Of Pet can not have more than 3 blank\n";
        if(!num.matches(formatPrice)) return "Num Of Pet is wrong ( must be number )\n";
        return "";
    }

    public static String checkAddress(String addr){
        if(addr.isEmpty()) return "Address can not null\n";
        if(addr.contains("   ")) return "Address can not have more than 3 blank\n";
        if(addr.length()>200) return "Address max length is 200 characters\n";
        return "";
    }
    
   
    
    public static String checkAge(String age){
        String formatPrice = "\\d[0-9]{0,999}";
        if(age.isEmpty()) return "Age can not null\n";
        if(Integer.parseInt(age) <= 0) return "Age must be > 0\n";
        
        if(!age.matches(formatPrice)) return "Age is wrong ( must be number )\n";
        return "";
    }
    
    public static String checkSymptoms(String symp){
        if(symp.isEmpty()) return "Symptoms can not null\n";
        if(symp.contains("   ")) return "Symptoms can not have more than 3 blank\n";
        if(symp.length()>200) return "Symptoms max length is 200 characters\n";
        return "";
    }
    
}
