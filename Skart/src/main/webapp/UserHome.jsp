<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<Html>   
<Head>   
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
<Title>   
 Shopping 
</Title>
<style> 

header {
background-color: white ;
position: fixed;
margin :0px auto;
top: 0.1px;
height: 50px;
left: 0;  
right: 0; 
display: flex;
align-items: center;
}
header ul{
list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
  }

header * {
display: inline;

}
header li {
margin: 50px;
float: left;

}
li a:hover {
  background-color: #555;
  color: white;
}
header li a {
color: black;
display: block;
color: black;
text-align: center;
padding: 14px 16px;
text-decoration: none;
}
body {
	font-family: Arial;
	background-color: #DBF9FC;
	background-image:url(https://pwpblog.wpengine.com/wp-content/uploads/2022/08/Ecommerce-Website-Promotion_Final.png);
	background-size:cover;
}
.checked {
  color: orange;
}
.content{
top :1px;
background-color:white;
width:30%;
heigth:10%;
margin:15px;
box-sizing :border -box;
float :left;
border-radius :20px;
cursor: pointer;
padding-top;
box-shadow:0 14px 28px rgba(0,0,0,0.25);


}
h3{
text-align :center;
font-size :30px;
margin:0;
padding-top: 10px; 
}
.gallery{
display :flex;
flex-wrap :wrap;
width :100%;
align-items :center;
margin :50 px 0;
}
img{

align-items :center;
heigth :50%;
width :50%;
}



</style> 
</Head>
<Body>

<header>
<h1>SKART</h1>
<nav><ul>
<li><a href=""><b><%String name=(String)request.getAttribute("name");
out.print(name);%></b></a></li>
<li><a href="#"><b>My Orders</b></a></li>
<li><a href="#"> <b>My Cart </b> </a></li>
<li><a href="http://localhost:8080/Skart/HomePage.jsp"><b>Logout</b></a> </li>
</ul>
</nav>
</header>
<br>
<br>
<br>
<div class="content"> 
<center>
<br>
<img src="https://rukminim1.flixcart.com/image/416/416/kd1zngw0/headphone/v/k/n/tws-l21-mini-wireless-bluetooth-headset-earphone-dayneo-original-imafuf4ffbvgxckc.jpeg?q=70"></img>
<h4>DAYNEO Bluetooth Earphone   </h4>
<p>

Dayneo TrueWireless stereo technology, enjoy with earbuds. </p>
<h3>$1000</h3>
<ul>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
<span class="fa fa-star"></span>
</ul>
<button class="c1">ADD TO CART</button>
<button class="b1" >BUY NOW</button>
</center>
</div>
<div class="content">
<center>
<br>
<img src="https://rukminim1.flixcart.com/image/416/416/knyxqq80/dslr-camera/r/y/x/digital-camera-eos-m50-mark-ii-eos-m50-mark-ii-canon-original-imag2gzkexzqhyhu.jpeg?q=70"></img>

<h4>Canon EOS M50 Mark II </h4>
<p>
It also offers a range of more accessible and affordable cameras for beginners. </p>
<br>
<h3>$1500</h3>
<ul>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
<span class="fa fa-star"></span>
</ul>
<button class="c2">ADD TO CART</button>
<button class="b2" >BUY NOW</button>
</center>
</div>
<div class="content">
<center>
<br>
<br>
<img src="https://rukminim1.flixcart.com/image/416/416/kuyf8nk0/computer/3/n/s/mk183hn-a-laptop-apple-original-imag7yzkbgbwvwq3.jpeg?q=70"></img>
<h4>APPLE Macbook Pro M1 Pro </h4>
<p>

Testing conducted by Apple in May 2022 using pre-production 13-inch MacBook Pro systems with Apple M2.
</p>
<br>
<br>
<h3>$2500</h3>
<ul>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked "></span>
<span class="fa fa-star"></span>
</ul>
<button class="c3">ADD TO CART</button>
<button class="b3" >BUY NOW</button>
</center>
</div>
<div class="content">
<center>
<br>
<img src="https://rukminim1.flixcart.com/image/416/416/l0igvww0/mobile/r/q/m/-original-imagca5ajerqpfjy.jpeg?q=70"></img>
<p>
<h4>APPLE iPhone 13 (Green, 128 GB)</h4>
<p>
The iPhone 13 features a stylish design and innovative features that make it a delight to use. </p>
<h3>$2000</h3>
<ul>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
</ul>
<button class="c4">ADD TO CART</button>
<button class="b4" >BUY NOW</button>
</center>
</div>
<div class="content">
<center>
<br>
<img src="https://rukminim1.flixcart.com/image/416/416/xif0q/television/m/n/p/-original-imagkzctc2gkvfgf.jpeg?q=70"></img>
<p>
<h4>SAMSUNG 80 cm (32 Inch) HD Ready LED Smart Tizen TV </h4>
<p>
With this Samsung TV, every image on the screen comes to life, giving you a home theatre experience. 
</p>
<h3>$1,999</h3>
<ul>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
</ul>
<button class="c5">ADD TO CART</button>
<button class="b5" >BUY NOW</button>
</center>
</div>
<div class="content">
<center>
<br>
<img src="https://rukminim1.flixcart.com/image/416/416/kl9rssw0/allinone-desktop/z/s/0/ideacentre-a340-24iwl-lenovo-original-imagyfvbhawukw39.jpeg?q=70"></img>
<p>
<h4>Lenovo ideacentre Core i3</h4>

<p>
This Lenovo core i3 laptop is a convertible notebook and has a Windows 10 operating system 4 GB RAM 1 TB storage capacity. </p>
<h3>$2000</h3>
<ul>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star checked"></span>
<span class="fa fa-star"></span>
</ul>
<button class="c6">ADD TO CART</button>
<button class="b6" >BUY NOW</button>
</center>
</div>

</Body> 
</Html>

 
