# Dagger2InjectApplicationAndActivityContext
This project shows how we can pass the Application/Activity Context (instance) to Consumer classes. MainActivity is acted both as Service Component as wells as Consumer class. MainActivity is consumer for NannyApplication, whether it is Service component for NormalClass. 

NormalClass is always Consumer for both MainActivity and NannyApplication. 

Result
![alt text](https://github.com/uddhavgautam/Dagger2InjectApplicationAndActivityContext/blob/master/ContextPassCheck.png)

