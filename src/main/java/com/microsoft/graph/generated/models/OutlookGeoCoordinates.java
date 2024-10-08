package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OutlookGeoCoordinates implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OutlookGeoCoordinates} and sets the default values.
     */
    public OutlookGeoCoordinates() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OutlookGeoCoordinates}
     */
    @jakarta.annotation.Nonnull
    public static OutlookGeoCoordinates createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OutlookGeoCoordinates();
    }
    /**
     * Gets the accuracy property value. The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     * @return a {@link OutlookGeoCoordinatesAccuracy}
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinatesAccuracy getAccuracy() {
        return this.backingStore.get("accuracy");
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the altitude property value. The altitude of the location.
     * @return a {@link OutlookGeoCoordinatesAltitude}
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinatesAltitude getAltitude() {
        return this.backingStore.get("altitude");
    }
    /**
     * Gets the altitudeAccuracy property value. The accuracy of the altitude.
     * @return a {@link OutlookGeoCoordinatesAltitudeAccuracy}
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinatesAltitudeAccuracy getAltitudeAccuracy() {
        return this.backingStore.get("altitudeAccuracy");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("accuracy", (n) -> { this.setAccuracy(n.getObjectValue(OutlookGeoCoordinatesAccuracy::createFromDiscriminatorValue)); });
        deserializerMap.put("altitude", (n) -> { this.setAltitude(n.getObjectValue(OutlookGeoCoordinatesAltitude::createFromDiscriminatorValue)); });
        deserializerMap.put("altitudeAccuracy", (n) -> { this.setAltitudeAccuracy(n.getObjectValue(OutlookGeoCoordinatesAltitudeAccuracy::createFromDiscriminatorValue)); });
        deserializerMap.put("latitude", (n) -> { this.setLatitude(n.getObjectValue(OutlookGeoCoordinatesLatitude::createFromDiscriminatorValue)); });
        deserializerMap.put("longitude", (n) -> { this.setLongitude(n.getObjectValue(OutlookGeoCoordinatesLongitude::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the latitude property value. The latitude of the location.
     * @return a {@link OutlookGeoCoordinatesLatitude}
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinatesLatitude getLatitude() {
        return this.backingStore.get("latitude");
    }
    /**
     * Gets the longitude property value. The longitude of the location.
     * @return a {@link OutlookGeoCoordinatesLongitude}
     */
    @jakarta.annotation.Nullable
    public OutlookGeoCoordinatesLongitude getLongitude() {
        return this.backingStore.get("longitude");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("accuracy", this.getAccuracy());
        writer.writeObjectValue("altitude", this.getAltitude());
        writer.writeObjectValue("altitudeAccuracy", this.getAltitudeAccuracy());
        writer.writeObjectValue("latitude", this.getLatitude());
        writer.writeObjectValue("longitude", this.getLongitude());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accuracy property value. The accuracy of the latitude and longitude. As an example, the accuracy can be measured in meters, such as the latitude and longitude are accurate to within 50 meters.
     * @param value Value to set for the accuracy property.
     */
    public void setAccuracy(@jakarta.annotation.Nullable final OutlookGeoCoordinatesAccuracy value) {
        this.backingStore.set("accuracy", value);
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the altitude property value. The altitude of the location.
     * @param value Value to set for the altitude property.
     */
    public void setAltitude(@jakarta.annotation.Nullable final OutlookGeoCoordinatesAltitude value) {
        this.backingStore.set("altitude", value);
    }
    /**
     * Sets the altitudeAccuracy property value. The accuracy of the altitude.
     * @param value Value to set for the altitudeAccuracy property.
     */
    public void setAltitudeAccuracy(@jakarta.annotation.Nullable final OutlookGeoCoordinatesAltitudeAccuracy value) {
        this.backingStore.set("altitudeAccuracy", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the latitude property value. The latitude of the location.
     * @param value Value to set for the latitude property.
     */
    public void setLatitude(@jakarta.annotation.Nullable final OutlookGeoCoordinatesLatitude value) {
        this.backingStore.set("latitude", value);
    }
    /**
     * Sets the longitude property value. The longitude of the location.
     * @param value Value to set for the longitude property.
     */
    public void setLongitude(@jakarta.annotation.Nullable final OutlookGeoCoordinatesLongitude value) {
        this.backingStore.set("longitude", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class OutlookGeoCoordinatesAccuracy implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link OutlookGeoCoordinatesAccuracy} and sets the default values.
         */
        public OutlookGeoCoordinatesAccuracy() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link OutlookGeoCoordinatesAccuracy}
         */
        @jakarta.annotation.Nonnull
        public static OutlookGeoCoordinatesAccuracy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final OutlookGeoCoordinatesAccuracy result = new OutlookGeoCoordinatesAccuracy();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class OutlookGeoCoordinatesAltitude implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link OutlookGeoCoordinatesAltitude} and sets the default values.
         */
        public OutlookGeoCoordinatesAltitude() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link OutlookGeoCoordinatesAltitude}
         */
        @jakarta.annotation.Nonnull
        public static OutlookGeoCoordinatesAltitude createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final OutlookGeoCoordinatesAltitude result = new OutlookGeoCoordinatesAltitude();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class OutlookGeoCoordinatesAltitudeAccuracy implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link OutlookGeoCoordinatesAltitudeAccuracy} and sets the default values.
         */
        public OutlookGeoCoordinatesAltitudeAccuracy() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link OutlookGeoCoordinatesAltitudeAccuracy}
         */
        @jakarta.annotation.Nonnull
        public static OutlookGeoCoordinatesAltitudeAccuracy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final OutlookGeoCoordinatesAltitudeAccuracy result = new OutlookGeoCoordinatesAltitudeAccuracy();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class OutlookGeoCoordinatesLatitude implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link OutlookGeoCoordinatesLatitude} and sets the default values.
         */
        public OutlookGeoCoordinatesLatitude() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link OutlookGeoCoordinatesLatitude}
         */
        @jakarta.annotation.Nonnull
        public static OutlookGeoCoordinatesLatitude createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final OutlookGeoCoordinatesLatitude result = new OutlookGeoCoordinatesLatitude();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
    /**
     * Composed type wrapper for classes {@link Double}, {@link ReferenceNumeric}, {@link String}
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class OutlookGeoCoordinatesLongitude implements BackedModel, ComposedTypeWrapper, Parsable {
        /**
         * Stores model information.
         */
        @jakarta.annotation.Nonnull
        protected BackingStore backingStore;
        /**
         * Instantiates a new {@link OutlookGeoCoordinatesLongitude} and sets the default values.
         */
        public OutlookGeoCoordinatesLongitude() {
            this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        }
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a {@link OutlookGeoCoordinatesLongitude}
         */
        @jakarta.annotation.Nonnull
        public static OutlookGeoCoordinatesLongitude createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final OutlookGeoCoordinatesLongitude result = new OutlookGeoCoordinatesLongitude();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            if (parseNode.getEnumValue(ReferenceNumeric::forValue) != null) {
                result.setReferenceNumeric(parseNode.getEnumValue(ReferenceNumeric::forValue));
            } else if (parseNode.getDoubleValue() != null) {
                result.setDouble(parseNode.getDoubleValue());
            } else if (parseNode.getStringValue() != null) {
                result.setString(parseNode.getStringValue());
            }
            return result;
        }
        /**
         * Gets the backingStore property value. Stores model information.
         * @return a {@link BackingStore}
         */
        @jakarta.annotation.Nonnull
        public BackingStore getBackingStore() {
            return this.backingStore;
        }
        /**
         * Gets the double property value. Composed type representation for type {@link Double}
         * @return a {@link Double}
         */
        @jakarta.annotation.Nullable
        public Double getDouble() {
            return this.backingStore.get("double");
        }
        /**
         * The deserialization information for the current model
         * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @return a {@link ReferenceNumeric}
         */
        @jakarta.annotation.Nullable
        public ReferenceNumeric getReferenceNumeric() {
            return this.backingStore.get("referenceNumeric");
        }
        /**
         * Gets the string property value. Composed type representation for type {@link String}
         * @return a {@link String}
         */
        @jakarta.annotation.Nullable
        public String getString() {
            return this.backingStore.get("string");
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getReferenceNumeric() != null) {
                writer.writeEnumValue(null, this.getReferenceNumeric());
            } else if (this.getDouble() != null) {
                writer.writeDoubleValue(null, this.getDouble());
            } else if (this.getString() != null) {
                writer.writeStringValue(null, this.getString());
            }
        }
        /**
         * Sets the backingStore property value. Stores model information.
         * @param value Value to set for the backingStore property.
         */
        public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
            Objects.requireNonNull(value);
            this.backingStore = value;
        }
        /**
         * Sets the double property value. Composed type representation for type {@link Double}
         * @param value Value to set for the double property.
         */
        public void setDouble(@jakarta.annotation.Nullable final Double value) {
            this.backingStore.set("double", value);
        }
        /**
         * Sets the ReferenceNumeric property value. Composed type representation for type {@link ReferenceNumeric}
         * @param value Value to set for the ReferenceNumeric property.
         */
        public void setReferenceNumeric(@jakarta.annotation.Nullable final ReferenceNumeric value) {
            this.backingStore.set("referenceNumeric", value);
        }
        /**
         * Sets the string property value. Composed type representation for type {@link String}
         * @param value Value to set for the string property.
         */
        public void setString(@jakarta.annotation.Nullable final String value) {
            this.backingStore.set("string", value);
        }
    }
}
