# Working with Open Types
The Microsoft Graph SDK for Android allows you to capture, inspect, modify, and export properties not captured by the SDK's built-in native entity definitions.

Suppose you have an `EntityType` describing a Vehicle:
```xml
<EntityType Name="vehicle" BaseType="your.namespace.entity" OpenType="true">
   <Property Name="make" Type="Edm.String" Unicode="false" />
   <Property Name="model" Type="Edm.String" Unicode="false" />
   <Property Name="modelYear" Type="Edm.Int32" />
</EntityType>
```

Represented as JSON, this object might take the following form:
```json
{
    "id": "9043ff12-6046-495f-8a0f-4a0f65a3f288",
    "make": "Chase Motor Truck Company",
    "model": "Model M",
    "modelYear": "1912"
}
```

As a native Java object, you might choose to implement this entity thusly:
```java
class Vehicle extends BaseEntity {
    String make;
    String model;
    Year modelYear;
}
```

Because `vehicle` is defined as an `OpenType`, additional undeclared properties may be sent by the web service: in this case, a license plate number.

```json
{
    "id": "9043ff12-6046-495f-8a0f-4a0f65a3f288",
    "make": "Chase Motor Truck Company",
    "model": "Model M",
    "modelYear": "1912",
    "licensePlate": "MSGRAPH4U"
}
```

With the addition of the `AdditionalDataManager` (as of `v1.1.1`), capture and transmission of such properties is supported through a transient native property.

## Examples

### Querying undeclared properties
Using the above example, we'll query our vehicle entity for the undeclared `licensePlate` property:

```java
// Load a Vehicle
Vehicle vehicle = getVehicleById("<some id>");

// Access the licensePlate property
String licensePlate = 
    vehicle
        .getAdditionalDataManager()
        .get("licensePlate")
        .getAsString();
```

### Initialize undeclared properties
To specify an undeclared property, the following syntax may be used:

```java
vehicle
    .getAdditionalDataManager()
    .put("numberOfDoors", new JsonPrimitive(0));
```

This syntax supports all null, object, array, and primitive JSON structures.
