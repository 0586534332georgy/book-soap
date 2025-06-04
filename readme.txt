http://localhost:8081/ws/books?wsdl
http://localhost:8081/ws/books?xsd=1


POST	http://localhost:8081/ws/books


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