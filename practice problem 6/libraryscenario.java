public class libraryscenario {
    class books{
        public int BookId;
        public String BookName, BookAuthor, YearofPub, Status;
        public float Price;
        public void AddNewBooks(){
            System.out.println("New book added!");
        }
        public void DeleteBooks(){

        }
        public void DisplayBookDetails(){

        }
        public void InquiryBook (){

        }
    }
    class Librarian{
        public int Id;
        public String Name;
        public void SearchBook(String name){

        }
        public boolean VerifyMember(int id){
            boolean b = false;
            return b;
        }
        public void OrderBooks(){

        }
        public void SellBooks(){

        }
    }
    class Publisher{
        public int Id, PhoneNo;
        public String Name, Address;
        public void AddPub(){

        }
        public void ModifyPub(){

        }
        public void DeletePub(){

        }
        public void OrderStatus(){

        }
    }
    class User{
        public int UserID, PhoneNo;
        public String UserName, UserAddress;
        public void ReturnBooks(){

        }
        public int PayFine(int date){
            int fine = 0;
            return fine;
        }
        public void AddNewUser(){

        }
        public void DeleteUser(){

        }
        public void UpdateDetails(){

        }
        public void BookPurchase(){

        }
    }
    public static void main(String[] args) {
        
    }
}
