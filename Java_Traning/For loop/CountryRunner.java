class CountryRunner
{
public static void main(String args[])
{
String[] NamesOfStates={"Andhra Pradhesh","Arunacha Pradhesh","Assam","Bihar","Chattisgarh","Goa","Gujarath","Harayna","Himachal Pradhesh","Jharkand",
                      "Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab",
"Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakand","West Bengal"};
Country.state(NamesOfStates);
System.out.println("---------------------------------------------------------------------------------");


String[] parties={"Bharathiya Janatha Party","Indian Natinal Congress","Natinal People party","Bahujan Samaj Party","Janatha Dal"};
Country.PoliticalParties(parties);
System.out.println("---------------------------------------------------------------------------------");

String[] primeMinster={"Jawaharlal Nehru","Gulzarilal Nanda","Indira Gandhi","Morarji Desai","Rajiv Gandhi","V.P. Singh",
            "Chandra Shekhar","P.V. Narasimha Rao","Atal Bihari Vajpayee","H.D. Deve Gowda","Inder Kumar Gujral","Manmohan Singh","Narendra Modi"};
			
Country.primeMinister(primeMinster);
System.out.println("---------------------------------------------------------------------------------");

int[] pincode={560007,560007,560092,560024,562106,560045,560003,560050,560064,560047};
Country.pinCode( pincode);
System.out.println("---------------------------------------------------------------------------------");

String[] ministers={"Shri Narendra Modi","Shri Raj Nath Singh","Shri Nitin Jairam Gadkari","Shri Shivraj Singh Chouhan",
"Dr. Subrahmanyam Jaishankar","Shri H. D. Kumaraswamy","Shri Dharmendra Pradhan","Shri Rajiv Ranjan Singh alias Lalan Singh",
"Dr. Virendra Kumar","Shri Pralhad Joshi","Shri Giriraj Singh","Shri Jyotiraditya M. Scindia","Shri Gajendra Singh Shekhawat","Shri Kiren Rijiju",
"Shri Mansukh L. Mandaviya","Shri Chirag Paswan","Shri Amit Shah","Shri Jagat Prakash Nadda","Smt. Nirmala Sitharaman",
"Shri Manohar Lal","Shri Piyush Goyal","Shri Jitan Ram Manjhi","Shri Sarbananda Sonowal","Shri Kinjarapu Rammohan Naidu","Shri Jual Oram",
"Shri Ashwini Vaishnaw","Shri Bhupender Yadav","Smt. Annpurna Devi","Shri Hardeep Singh Puri","Shri G. Kishan Reddy","Shri C R Patil"};

Country.cabinetMinister(ministers);
System.out.println("---------------------------------------------------------------------------------");

Country.stateBackward(NamesOfStates);
System.out.println("---------------------------------------------------------------------------------");
Country.PoliticalPartiesBackwards(parties);
System.out.println("---------------------------------------------------------------------------------");
Country.primeMinisterBackward(primeMinster);
System.out.println("---------------------------------------------------------------------------------");

Country.pinCodeBackward(pincode);
System.out.println("---------------------------------------------------------------------------------");

Country.cabinetMinisterBackward(ministers);
System.out.println("---------------------------------------------------------------------------------");
}
}

