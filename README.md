## Start services in docker
```
./gradlew build
docker-compose up
```

## Create a doctor
```
curl -d '{"firstName":"Vivek", "lastName":"Rao"}' -H "Content-Type: application/json" -X POST 'http://localhost:8080/doctor'
```

## List all doctors
```
curl -X GET 'http://localhost:8080/doctor'
```

## Create an appointment
```
curl -d '{"doctorId":"<doctor-id>", "patientFirstName":"John", "patientLastName":"Doe", "appointmentDate":"2022-06-23T12:30"}' -H "Content-Type: application/json" -X POST 'http://localhost:8080/appointment'
```

## Delete an appointment
```
curl -X DELETE 'http://localhost:8080/appointment/delete/<appointment-id>'
```

## Add a new appointment
```
curl -d '{"doctorId":"<doctor-id>", "patientFirstName":"John", "patientLastName":"Doe", "appointmentDate":"2022-06-25T12:30", "appointmentType":"NewPatient"}' -H "Content-Type: application/json" -X POST 'http://localhost:8080/appointment'
```

## List all appointments for a particular doctor on a particular day
```
curl -X GET 'http://localhost:8080/appointment/doctor/<doctor-id>/date/2022-06-25'
```

## Missing features
I couldn't complete the 15 minute interval and 3 appointment constraint features. Out of time :(
