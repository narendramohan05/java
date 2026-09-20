class string {
    public static void main(String[] args) {
        String str="nithish";
        String str2="nitjish";
        boolean same=true;
        if(str.length()!=str2.length()){
            System.out.println("different");
            return;
        }else{
            
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str2.charAt(i)){
                same=false;
                break;
        }}}
    
    
    if (same){
        System.out.println("same");

    }else
        System.out.println("different");
    }
    }
    

