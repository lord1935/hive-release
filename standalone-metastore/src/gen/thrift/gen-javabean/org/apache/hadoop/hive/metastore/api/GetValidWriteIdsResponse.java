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
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class GetValidWriteIdsResponse implements org.apache.thrift.TBase<GetValidWriteIdsResponse, GetValidWriteIdsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetValidWriteIdsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetValidWriteIdsResponse");

  private static final org.apache.thrift.protocol.TField TBL_VALID_WRITE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("tblValidWriteIds", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetValidWriteIdsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetValidWriteIdsResponseTupleSchemeFactory());
  }

  private List<TableValidWriteIds> tblValidWriteIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TBL_VALID_WRITE_IDS((short)1, "tblValidWriteIds");

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
        case 1: // TBL_VALID_WRITE_IDS
          return TBL_VALID_WRITE_IDS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TBL_VALID_WRITE_IDS, new org.apache.thrift.meta_data.FieldMetaData("tblValidWriteIds", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TableValidWriteIds.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetValidWriteIdsResponse.class, metaDataMap);
  }

  public GetValidWriteIdsResponse() {
  }

  public GetValidWriteIdsResponse(
    List<TableValidWriteIds> tblValidWriteIds)
  {
    this();
    this.tblValidWriteIds = tblValidWriteIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetValidWriteIdsResponse(GetValidWriteIdsResponse other) {
    if (other.isSetTblValidWriteIds()) {
      List<TableValidWriteIds> __this__tblValidWriteIds = new ArrayList<TableValidWriteIds>(other.tblValidWriteIds.size());
      for (TableValidWriteIds other_element : other.tblValidWriteIds) {
        __this__tblValidWriteIds.add(new TableValidWriteIds(other_element));
      }
      this.tblValidWriteIds = __this__tblValidWriteIds;
    }
  }

  public GetValidWriteIdsResponse deepCopy() {
    return new GetValidWriteIdsResponse(this);
  }

  @Override
  public void clear() {
    this.tblValidWriteIds = null;
  }

  public int getTblValidWriteIdsSize() {
    return (this.tblValidWriteIds == null) ? 0 : this.tblValidWriteIds.size();
  }

  public java.util.Iterator<TableValidWriteIds> getTblValidWriteIdsIterator() {
    return (this.tblValidWriteIds == null) ? null : this.tblValidWriteIds.iterator();
  }

  public void addToTblValidWriteIds(TableValidWriteIds elem) {
    if (this.tblValidWriteIds == null) {
      this.tblValidWriteIds = new ArrayList<TableValidWriteIds>();
    }
    this.tblValidWriteIds.add(elem);
  }

  public List<TableValidWriteIds> getTblValidWriteIds() {
    return this.tblValidWriteIds;
  }

  public void setTblValidWriteIds(List<TableValidWriteIds> tblValidWriteIds) {
    this.tblValidWriteIds = tblValidWriteIds;
  }

  public void unsetTblValidWriteIds() {
    this.tblValidWriteIds = null;
  }

  /** Returns true if field tblValidWriteIds is set (has been assigned a value) and false otherwise */
  public boolean isSetTblValidWriteIds() {
    return this.tblValidWriteIds != null;
  }

  public void setTblValidWriteIdsIsSet(boolean value) {
    if (!value) {
      this.tblValidWriteIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TBL_VALID_WRITE_IDS:
      if (value == null) {
        unsetTblValidWriteIds();
      } else {
        setTblValidWriteIds((List<TableValidWriteIds>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TBL_VALID_WRITE_IDS:
      return getTblValidWriteIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TBL_VALID_WRITE_IDS:
      return isSetTblValidWriteIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetValidWriteIdsResponse)
      return this.equals((GetValidWriteIdsResponse)that);
    return false;
  }

  public boolean equals(GetValidWriteIdsResponse that) {
    if (that == null)
      return false;

    boolean this_present_tblValidWriteIds = true && this.isSetTblValidWriteIds();
    boolean that_present_tblValidWriteIds = true && that.isSetTblValidWriteIds();
    if (this_present_tblValidWriteIds || that_present_tblValidWriteIds) {
      if (!(this_present_tblValidWriteIds && that_present_tblValidWriteIds))
        return false;
      if (!this.tblValidWriteIds.equals(that.tblValidWriteIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tblValidWriteIds = true && (isSetTblValidWriteIds());
    list.add(present_tblValidWriteIds);
    if (present_tblValidWriteIds)
      list.add(tblValidWriteIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetValidWriteIdsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTblValidWriteIds()).compareTo(other.isSetTblValidWriteIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblValidWriteIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblValidWriteIds, other.tblValidWriteIds);
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
    StringBuilder sb = new StringBuilder("GetValidWriteIdsResponse(");
    boolean first = true;

    sb.append("tblValidWriteIds:");
    if (this.tblValidWriteIds == null) {
      sb.append("null");
    } else {
      sb.append(this.tblValidWriteIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetTblValidWriteIds()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tblValidWriteIds' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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

  private static class GetValidWriteIdsResponseStandardSchemeFactory implements SchemeFactory {
    public GetValidWriteIdsResponseStandardScheme getScheme() {
      return new GetValidWriteIdsResponseStandardScheme();
    }
  }

  private static class GetValidWriteIdsResponseStandardScheme extends StandardScheme<GetValidWriteIdsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetValidWriteIdsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TBL_VALID_WRITE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list610 = iprot.readListBegin();
                struct.tblValidWriteIds = new ArrayList<TableValidWriteIds>(_list610.size);
                TableValidWriteIds _elem611;
                for (int _i612 = 0; _i612 < _list610.size; ++_i612)
                {
                  _elem611 = new TableValidWriteIds();
                  _elem611.read(iprot);
                  struct.tblValidWriteIds.add(_elem611);
                }
                iprot.readListEnd();
              }
              struct.setTblValidWriteIdsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetValidWriteIdsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tblValidWriteIds != null) {
        oprot.writeFieldBegin(TBL_VALID_WRITE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.tblValidWriteIds.size()));
          for (TableValidWriteIds _iter613 : struct.tblValidWriteIds)
          {
            _iter613.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetValidWriteIdsResponseTupleSchemeFactory implements SchemeFactory {
    public GetValidWriteIdsResponseTupleScheme getScheme() {
      return new GetValidWriteIdsResponseTupleScheme();
    }
  }

  private static class GetValidWriteIdsResponseTupleScheme extends TupleScheme<GetValidWriteIdsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetValidWriteIdsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tblValidWriteIds.size());
        for (TableValidWriteIds _iter614 : struct.tblValidWriteIds)
        {
          _iter614.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetValidWriteIdsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list615 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.tblValidWriteIds = new ArrayList<TableValidWriteIds>(_list615.size);
        TableValidWriteIds _elem616;
        for (int _i617 = 0; _i617 < _list615.size; ++_i617)
        {
          _elem616 = new TableValidWriteIds();
          _elem616.read(iprot);
          struct.tblValidWriteIds.add(_elem616);
        }
      }
      struct.setTblValidWriteIdsIsSet(true);
    }
  }

}

