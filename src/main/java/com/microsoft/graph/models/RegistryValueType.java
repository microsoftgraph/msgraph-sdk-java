package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the security singleton. */
public enum RegistryValueType implements ValuedEnum {
    Unknown("unknown"),
    Binary("binary"),
    Dword("dword"),
    DwordLittleEndian("dwordLittleEndian"),
    DwordBigEndian("dwordBigEndian"),
    ExpandSz("expandSz"),
    Link("link"),
    MultiSz("multiSz"),
    None("none"),
    Qword("qword"),
    QwordlittleEndian("qwordlittleEndian"),
    Sz("sz"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    RegistryValueType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static RegistryValueType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "unknown": return Unknown;
            case "binary": return Binary;
            case "dword": return Dword;
            case "dwordLittleEndian": return DwordLittleEndian;
            case "dwordBigEndian": return DwordBigEndian;
            case "expandSz": return ExpandSz;
            case "link": return Link;
            case "multiSz": return MultiSz;
            case "none": return None;
            case "qword": return Qword;
            case "qwordlittleEndian": return QwordlittleEndian;
            case "sz": return Sz;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
