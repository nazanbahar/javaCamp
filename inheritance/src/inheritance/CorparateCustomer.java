package inheritance;

/**
 * @author User
 *YILDIZLI NOT:
 *s1. "Bir sınıf sadece yapabildiklerini baraındırmalıdır!"
 *s2. BUG-FREE yazılım olmaz! 
 *s3. Soyutlama yapmazsan veritabanı spagetti olur.  
 *STEP1: Inharitance?
 *s1. id, customerNumber ortak base musteriye at. base, super
 */
public class CorparateCustomer extends Customer {
	String companyName;
	String taxNumber;
}
