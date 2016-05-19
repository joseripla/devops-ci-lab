var http = require('http');

var redis = require("redis"),
    client = redis.createClient({host: "127.0.0.1",port:6379});

client.on("error", function (err) {
    console.log("Error " + err);
});

//client.set("sum",0);
var visit=0;

var handleRequest = function(request, response) {

  console.log("I can write to console");
 
  client.get("missingkey", function(err, reply) {
    // reply is null when the key is missing
  //  console.log("missingKey - DataNotFound");
  });

  client.get("sum", function(err, reply) {
    // reply is null when the key is missing
	console.log(reply)
  if(reply){
   	//v = reply;
	v = (parseInt(reply) + 1);
	client.set("sum",v);
        visit = v;
  }else{
	console.log("DataNotFound");
	client.set("sum",0);
	}
  });

  response.writeHead(200);
  response.write("Hello Lab !!");
  response.end("Visitas: "+visit);
}
var www = http.createServer(handleRequest);
www.listen(8080);
