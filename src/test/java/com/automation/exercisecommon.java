package com.automation;


public class exercisecommon {
        public String solution(String n,int B[][]){
            String a = "${_getData";
            int len = a.length();
            if(n.indexOf(a) == -1){
                System.out.println("Don't have any value on string ");
            }
            else{
               for (int i = 0; i < n.length();i++){
                    String str1 = "$";
                    String k = String.valueOf(n.charAt(i));
                    if(k.equals(str1)){
                        String str2 = n.substring(i+len);
                        String str3 = "][";
                        String str4 = "]}";                        
                        if(str2.substring(2, 4).equals(str3) && str2.substring(5, 7).equals(str4)){
                            try{
                                int hi1 = Integer.parseInt(str2.substring(1, 2));                              
                                int hi2 = Integer.parseInt(str2.substring(4, 5));  
                                System.out.println("String contain two-way array "+B[hi1][hi2]);
                            } catch (Exception e){
                                System.out.println("Don't have any value on string 2 "+e);
                            }
                        }
                        else if( str2.substring(2, 4).equals(str4)){
                            try{
                                int hi3 = Integer.parseInt(str2.substring(1, 2));                               
                                System.out.println("String contain one-way "+B[0][hi3]);
                            } catch (Exception e){
                                System.out.println("Don't have any value on string 3"+e);
                            }
                        }
                        }
                        
                        
                    
                }
            }
            return n;
        }
}
