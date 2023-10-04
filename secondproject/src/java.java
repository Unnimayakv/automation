public class java{
public static void main(String[] args){
System.setproperty(“webdriver.chrome.driver”,”//path”);
Webdriver driver=new Chromedriver();
String homepage=”//sitepath”;
String url=null;
HttpsURLConnection huc=null;
int respcode=200;
driver.manage().window().maximise();
driver.get(homepage);
java.util.List<WebElement> links=driver.findElements(By.tagName(“a”));
Iterator<WebElement> it=links.iterator();
while(it.hasNext())
{
url=it.next().getAttribute(“href”);
System.out.println(url);
if(url==null || url.isEmpty())
{
System.out.println(“url is not configured or its empty”);
continue;
}
if(!url.startsWith(homepage))
{
System.out.println(“url belongs to another domain”);
continue;
}
try{
huc=(HttpsURLConnection)(new URL(url).openConnection());
huc.setRequestmethod(“HEAD”);
huc.connect();
respcode=huc.getResponseCode();
if(respcode>=400)
{
System.out.println(url+ “is a broken link”);
}
else
{
system.out.println(url+ “is a valid link”);
}
}catch(malFormedURLException e){
e.printStackTrace();
}
catch(IOException e)
{
e.printstackTrace()