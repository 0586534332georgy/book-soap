http://localhost:8081/ws/books?wsdl
http://localhost:8081/ws/books?xsd=1

http://localhost:8081/ws/books?xsd


POST	http://localhost:8081/ws/books


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:getAll/>              
   </soapenv:Body>
</soapenv:Envelope>


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:getAll2/>              
   </soapenv:Body>
</soapenv:Envelope>


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:getBooksByGenre>
         <bookGenre>Horror</bookGenre>
      </book:getBooksByGenre>
   </soapenv:Body>
</soapenv:Envelope>

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:getBooksByGenreAndPagesOrdered>
         <bookGenre>NonFiction</bookGenre>
         <min>200</min>
         <max>500</max>
      </book:getBooksByGenreAndPagesOrdered>
   </soapenv:Body>
</soapenv:Envelope>


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:getFreeBooks/>
   </soapenv:Body>
</soapenv:Envelope>


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:getReservedBooks/>
   </soapenv:Body>
</soapenv:Envelope>


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:book="http://service.soap.book/">
   <soapenv:Header/>
   <soapenv:Body>
      <book:setBookFree>
         <title>A Streetcar Named Desire</title>
      </book:setBookFree>
   </soapenv:Body>
</soapenv:Envelope>
