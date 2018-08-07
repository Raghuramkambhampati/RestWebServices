
Links to acess REST Services.
Create: 
POST
http://localhost:8080/Bill/insert
{
	"id":"2",
	 "n":2,
	 "items": [ {"id":"1" , "name": "Onions","desc": "white","category": "vegetables","price": 25},
	            {"id":"2" , "name": "carrot","desc": "small","category": "vegetables","price": 34}
	          ]
}
Read: 
GET
http://localhost:8080/Bill/getbill/1
Update: 
PUT
http://localhost:8080/Bill/updatebill
{
	"id":"2",
	 "n":2,
	 "items": [ {"id":"1" , "name": "Onions","desc": "white","category": "vegetables","price": 10},
	            {"id":"2" , "name": "carrot","desc": "small","category": "vegetables","price": 20}
	          ]
}
Delete: 
DELETE
http://localhost:8080/Bill/deletebill/1
