/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetTablesRequest implements org.apache.thrift.TBase<GetTablesRequest, GetTablesRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetTablesRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetTablesRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TBL_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("tblNames", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CAPABILITIES_FIELD_DESC = new org.apache.thrift.protocol.TField("capabilities", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetTablesRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetTablesRequestTupleSchemeFactory());
  }

  private String dbName; // required
  private List<String> tblNames; // optional
  private ClientCapabilities capabilities; // optional
  private String catName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TBL_NAMES((short)2, "tblNames"),
    CAPABILITIES((short)3, "capabilities"),
    CAT_NAME((short)4, "catName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TBL_NAMES
          return TBL_NAMES;
        case 3: // CAPABILITIES
          return CAPABILITIES;
        case 4: // CAT_NAME
          return CAT_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.TBL_NAMES,_Fields.CAPABILITIES,_Fields.CAT_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAMES, new org.apache.thrift.meta_data.FieldMetaData("tblNames", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CAPABILITIES, new org.apache.thrift.meta_data.FieldMetaData("capabilities", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ClientCapabilities.class)));
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetTablesRequest.class, metaDataMap);
  }

  public GetTablesRequest() {
  }

  public GetTablesRequest(
    String dbName)
  {
    this();
    this.dbName = dbName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetTablesRequest(GetTablesRequest other) {
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTblNames()) {
      List<String> __this__tblNames = new ArrayList<String>(other.tblNames);
      this.tblNames = __this__tblNames;
    }
    if (other.isSetCapabilities()) {
      this.capabilities = new ClientCapabilities(other.capabilities);
    }
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
  }

  public GetTablesRequest deepCopy() {
    return new GetTablesRequest(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tblNames = null;
    this.capabilities = null;
    this.catName = null;
  }

  public String getDbName() {
    return this.dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  public int getTblNamesSize() {
    return (this.tblNames == null) ? 0 : this.tblNames.size();
  }

  public java.util.Iterator<String> getTblNamesIterator() {
    return (this.tblNames == null) ? null : this.tblNames.iterator();
  }

  public void addToTblNames(String elem) {
    if (this.tblNames == null) {
      this.tblNames = new ArrayList<String>();
    }
    this.tblNames.add(elem);
  }

  public List<String> getTblNames() {
    return this.tblNames;
  }

  public void setTblNames(List<String> tblNames) {
    this.tblNames = tblNames;
  }

  public void unsetTblNames() {
    this.tblNames = null;
  }

  /** Returns true if field tblNames is set (has been assigned a value) and false otherwise */
  public boolean isSetTblNames() {
    return this.tblNames != null;
  }

  public void setTblNamesIsSet(boolean value) {
    if (!value) {
      this.tblNames = null;
    }
  }

  public ClientCapabilities getCapabilities() {
    return this.capabilities;
  }

  public void setCapabilities(ClientCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public void unsetCapabilities() {
    this.capabilities = null;
  }

  /** Returns true if field capabilities is set (has been assigned a value) and false otherwise */
  public boolean isSetCapabilities() {
    return this.capabilities != null;
  }

  public void setCapabilitiesIsSet(boolean value) {
    if (!value) {
      this.capabilities = null;
    }
  }

  public String getCatName() {
    return this.catName;
  }

  public void setCatName(String catName) {
    this.catName = catName;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((String)value);
      }
      break;

    case TBL_NAMES:
      if (value == null) {
        unsetTblNames();
      } else {
        setTblNames((List<String>)value);
      }
      break;

    case CAPABILITIES:
      if (value == null) {
        unsetCapabilities();
      } else {
        setCapabilities((ClientCapabilities)value);
      }
      break;

    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TBL_NAMES:
      return getTblNames();

    case CAPABILITIES:
      return getCapabilities();

    case CAT_NAME:
      return getCatName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case TBL_NAMES:
      return isSetTblNames();
    case CAPABILITIES:
      return isSetCapabilities();
    case CAT_NAME:
      return isSetCatName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetTablesRequest)
      return this.equals((GetTablesRequest)that);
    return false;
  }

  public boolean equals(GetTablesRequest that) {
    if (that == null)
      return false;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tblNames = true && this.isSetTblNames();
    boolean that_present_tblNames = true && that.isSetTblNames();
    if (this_present_tblNames || that_present_tblNames) {
      if (!(this_present_tblNames && that_present_tblNames))
        return false;
      if (!this.tblNames.equals(that.tblNames))
        return false;
    }

    boolean this_present_capabilities = true && this.isSetCapabilities();
    boolean that_present_capabilities = true && that.isSetCapabilities();
    if (this_present_capabilities || that_present_capabilities) {
      if (!(this_present_capabilities && that_present_capabilities))
        return false;
      if (!this.capabilities.equals(that.capabilities))
        return false;
    }

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dbName = true && (isSetDbName());
    list.add(present_dbName);
    if (present_dbName)
      list.add(dbName);

    boolean present_tblNames = true && (isSetTblNames());
    list.add(present_tblNames);
    if (present_tblNames)
      list.add(tblNames);

    boolean present_capabilities = true && (isSetCapabilities());
    list.add(present_capabilities);
    if (present_capabilities)
      list.add(capabilities);

    boolean present_catName = true && (isSetCatName());
    list.add(present_catName);
    if (present_catName)
      list.add(catName);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetTablesRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDbName()).compareTo(other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTblNames()).compareTo(other.isSetTblNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblNames, other.tblNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCapabilities()).compareTo(other.isSetCapabilities());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCapabilities()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.capabilities, other.capabilities);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCatName()).compareTo(other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetTablesRequest(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (isSetTblNames()) {
      if (!first) sb.append(", ");
      sb.append("tblNames:");
      if (this.tblNames == null) {
        sb.append("null");
      } else {
        sb.append(this.tblNames);
      }
      first = false;
    }
    if (isSetCapabilities()) {
      if (!first) sb.append(", ");
      sb.append("capabilities:");
      if (this.capabilities == null) {
        sb.append("null");
      } else {
        sb.append(this.capabilities);
      }
      first = false;
    }
    if (isSetCatName()) {
      if (!first) sb.append(", ");
      sb.append("catName:");
      if (this.catName == null) {
        sb.append("null");
      } else {
        sb.append(this.catName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (capabilities != null) {
      capabilities.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetTablesRequestStandardSchemeFactory implements SchemeFactory {
    public GetTablesRequestStandardScheme getScheme() {
      return new GetTablesRequestStandardScheme();
    }
  }

  private static class GetTablesRequestStandardScheme extends StandardScheme<GetTablesRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetTablesRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TBL_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list808 = iprot.readListBegin();
                struct.tblNames = new ArrayList<String>(_list808.size);
                String _elem809;
                for (int _i810 = 0; _i810 < _list808.size; ++_i810)
                {
                  _elem809 = iprot.readString();
                  struct.tblNames.add(_elem809);
                }
                iprot.readListEnd();
              }
              struct.setTblNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CAPABILITIES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.capabilities = new ClientCapabilities();
              struct.capabilities.read(iprot);
              struct.setCapabilitiesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetTablesRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tblNames != null) {
        if (struct.isSetTblNames()) {
          oprot.writeFieldBegin(TBL_NAMES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.tblNames.size()));
            for (String _iter811 : struct.tblNames)
            {
              oprot.writeString(_iter811);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.capabilities != null) {
        if (struct.isSetCapabilities()) {
          oprot.writeFieldBegin(CAPABILITIES_FIELD_DESC);
          struct.capabilities.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetTablesRequestTupleSchemeFactory implements SchemeFactory {
    public GetTablesRequestTupleScheme getScheme() {
      return new GetTablesRequestTupleScheme();
    }
  }

  private static class GetTablesRequestTupleScheme extends TupleScheme<GetTablesRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetTablesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      BitSet optionals = new BitSet();
      if (struct.isSetTblNames()) {
        optionals.set(0);
      }
      if (struct.isSetCapabilities()) {
        optionals.set(1);
      }
      if (struct.isSetCatName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetTblNames()) {
        {
          oprot.writeI32(struct.tblNames.size());
          for (String _iter812 : struct.tblNames)
          {
            oprot.writeString(_iter812);
          }
        }
      }
      if (struct.isSetCapabilities()) {
        struct.capabilities.write(oprot);
      }
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetTablesRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list813 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.tblNames = new ArrayList<String>(_list813.size);
          String _elem814;
          for (int _i815 = 0; _i815 < _list813.size; ++_i815)
          {
            _elem814 = iprot.readString();
            struct.tblNames.add(_elem814);
          }
        }
        struct.setTblNamesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.capabilities = new ClientCapabilities();
        struct.capabilities.read(iprot);
        struct.setCapabilitiesIsSet(true);
      }
      if (incoming.get(2)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
    }
  }

}

