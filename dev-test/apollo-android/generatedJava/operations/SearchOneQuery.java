package com.app.generated.graphql;

import com.apollographql.apollo.api.Query;
import java.lang.String;
import java.lang.Override;
import javax.annotation.Generated;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.api.ResponseField;
import javax.annotation.Nonnull;
import java.util.Collections;
import type.CustomType;
import javax.annotation.Nullable;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.Map;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import java.io.IOException;

@Generated("Apollo GraphQL")
public final class SearchOneQuery implements Query<SearchOneQuery.Data, SearchOneQuery.Data, SearchOneQuery.Variables> {
  public static final String OPERATION_DEFINITION = "query SearchOne($term: String!) {   searchOne(term: $term) {     id     ... on B {       b     }     ... on A {       a     }   } }";
  public static final String QUERY_DOCUMENT = OPERATION_DEFINITION;
  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "SearchOne";
    }
  };
  private final SearchOneQuery.Variables variables;
  @Override
   public String queryDocument() {
    return QUERY_DOCUMENT;
  }
  
  @Override
   public SearchOneQuery.Data wrapData(SearchOneQuery.Data data) {
    return data;
  }
  
  @Override
   public SearchOneQuery.Variables variables() {
    return variables;
  }
  
  @Override
   public ResponseFieldMapper<SearchOneQuery.Data> responseFieldMapper() {
    return new Data.Mapper();
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  @Override
   public OperationName name() {
    return OPERATION_NAME;
  }
  
  public String operationId() {
    return "eefe02d378aa4985eeb0a3a21232fa8d";
  }
  
  public SearchOneQuery(String term) {
    Utils.checkNotNull(term, "term == null");
    this.variables = new SearchOneQuery.Variables(term);
  }
  public static class Data implements Operation.Data {
    private final @Nonnull SearchOne searchOne;
    private volatile String $toString;
    private volatile int $hashCode;
    private volatile boolean $hashCodeMemoized;
    static final ResponseField[] $responseFields = {
        ResponseField.forObject("searchOne", "searchOne", new UnmodifiableMapBuilder<String, Object>(1).put("term", new UnmodifiableMapBuilder<String, Object>(2).put("kind", "Variable").put("variableName", "term").build()).build(), false, Collections.<ResponseField.Condition>emptyList())
      };
    public Data(@Nonnull SearchOne searchOne) {
      this.searchOne = Utils.checkNotNull(searchOne, "searchOne == null");
    }
    
    public @Nonnull SearchOne searchOne() {
      return this.searchOne;
    }
    
    @Override
     public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "searchOne=" + searchOne + ", "
          + "}";
      }
      
      return $toString;
    }
    
    @Override
     public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return this.searchOne.equals(that.searchOne);
      }
      
      return false;
    }
    
    @Override
     public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= searchOne.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      
      return $hashCode;
    }
    
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], searchOne != null ? searchOne.marshaller() : null);
        }
      };
    }
    public static final class Mapper implements ResponseFieldMapper<Data> {
      private final SearchOne.Mapper searchOneFieldMapper = new SearchOne.Mapper();
      @Override
       public Data map(ResponseReader reader) {
        final SearchOne searchOne = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<SearchOne>() {
                  @Override
                  public SearchOne read(ResponseReader reader) {
                    return searchOneFieldMapper.map(reader);
                  }
                });
        return new Data(searchOne);
      }
    }
    
  }
  

  public static class SearchOne {
    private final @Nonnull String __typename;
    private final @Nonnull String id;
    private final @Nullable AsB asB;
    private final @Nullable AsA asA;
    private volatile String $toString;
    private volatile int $hashCode;
    private volatile boolean $hashCodeMemoized;
    static final ResponseField[] $responseFields = {
        ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forCustomType("id", "id", null, false, CustomType.ID, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forInlineFragment("__typename", "__typename", Arrays.asList("B")),
        ResponseField.forInlineFragment("__typename", "__typename", Arrays.asList("A"))
      };
    public SearchOne(@Nonnull String __typename, @Nonnull String id, @Nullable AsB asB, @Nullable AsA asA) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = Utils.checkNotNull(id, "id == null");
      this.asB = asB;
      this.asA = asA;
    }
    
    public @Nonnull String __typename() {
      return this.__typename;
    }
    
    public @Nonnull String id() {
      return this.id;
    }
    
    public @Nullable AsB asB() {
      return this.asB;
    }
    
    public @Nullable AsA asA() {
      return this.asA;
    }
    
    @Override
     public String toString() {
      if ($toString == null) {
        $toString = "SearchOne{"
          + "__typename=" + __typename + ", "
          + "id=" + id + ", "
          + "asB=" + asB + ", "
          + "asA=" + asA + ", "
          + "}";
      }
      
      return $toString;
    }
    
    @Override
     public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof SearchOne) {
        SearchOne that = (SearchOne) o;
        return this.__typename.equals(that.__typename) && this.id.equals(that.id) && ((this.asB == null) ? (that.asB == null) : this.asB.equals(that.asB)) && ((this.asA == null) ? (that.asA == null) : this.asA.equals(that.asA));
      }
      
      return false;
    }
    
    @Override
     public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= id.hashCode();
        h *= 1000003;
        h ^= (asB == null) ? 0 : asB.hashCode();
        h *= 1000003;
        h ^= (asA == null) ? 0 : asA.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      
      return $hashCode;
    }
    
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeCustom((ResponseField.CustomTypeField) $responseFields[1], id);
          writer.writeObject($responseFields[2], asB != null ? asB.marshaller() : null);
          writer.writeObject($responseFields[3], asA != null ? asA.marshaller() : null);
        }
      };
    }
    public static final class Mapper implements ResponseFieldMapper<SearchOne> {
      private final AsB.Mapper asBFieldMapper = new AsB.Mapper();
      private final AsA.Mapper asAFieldMapper = new AsA.Mapper();
      @Override
       public SearchOne map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final AsB asB = reader.readObject($responseFields[2], new ResponseReader.ObjectReader<AsB>() {
                  @Override
                  public AsB read(ResponseReader reader) {
                    return asBFieldMapper.map(reader);
                  }
                });
        final AsA asA = reader.readObject($responseFields[3], new ResponseReader.ObjectReader<AsA>() {
                  @Override
                  public AsA read(ResponseReader reader) {
                    return asAFieldMapper.map(reader);
                  }
                });
        return new SearchOne(__typename, id, asB, asA);
      }
    }
    
  }
  

  public static class AsB {
    private final @Nonnull String __typename;
    private final @Nonnull String id;
    private final @Nullable String b;
    private volatile String $toString;
    private volatile int $hashCode;
    private volatile boolean $hashCodeMemoized;
    static final ResponseField[] $responseFields = {
        ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forString("b", "b", null, true, Collections.<ResponseField.Condition>emptyList())
      };
    public AsB(@Nonnull String __typename, @Nonnull String id, @Nullable String b) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = Utils.checkNotNull(id, "id == null");
      this.b = b;
    }
    
    public @Nonnull String __typename() {
      return this.__typename;
    }
    
    public @Nonnull String id() {
      return this.id;
    }
    
    public @Nullable String b() {
      return this.b;
    }
    
    @Override
     public String toString() {
      if ($toString == null) {
        $toString = "AsB{"
          + "__typename=" + __typename + ", "
          + "id=" + id + ", "
          + "b=" + b + ", "
          + "}";
      }
      
      return $toString;
    }
    
    @Override
     public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof AsB) {
        AsB that = (AsB) o;
        return this.__typename.equals(that.__typename) && this.id.equals(that.id) && ((this.b == null) ? (that.b == null) : this.b.equals(that.b));
      }
      
      return false;
    }
    
    @Override
     public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= id.hashCode();
        h *= 1000003;
        h ^= (b == null) ? 0 : b.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      
      return $hashCode;
    }
    
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeCustom((ResponseField.CustomTypeField) $responseFields[1], id);
          writer.writeString($responseFields[2], b != null ? b : null);
        }
      };
    }
    public static final class Mapper implements ResponseFieldMapper<AsB> {
      @Override
       public AsB map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String b = reader.readString($responseFields[2]);
        return new AsB(__typename, id, b);
      }
    }
    
  }
  

  public static class AsA {
    private final @Nonnull String __typename;
    private final @Nonnull String id;
    private final @Nullable String a;
    private volatile String $toString;
    private volatile int $hashCode;
    private volatile boolean $hashCodeMemoized;
    static final ResponseField[] $responseFields = {
        ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
        ResponseField.forString("a", "a", null, true, Collections.<ResponseField.Condition>emptyList())
      };
    public AsA(@Nonnull String __typename, @Nonnull String id, @Nullable String a) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = Utils.checkNotNull(id, "id == null");
      this.a = a;
    }
    
    public @Nonnull String __typename() {
      return this.__typename;
    }
    
    public @Nonnull String id() {
      return this.id;
    }
    
    public @Nullable String a() {
      return this.a;
    }
    
    @Override
     public String toString() {
      if ($toString == null) {
        $toString = "AsA{"
          + "__typename=" + __typename + ", "
          + "id=" + id + ", "
          + "a=" + a + ", "
          + "}";
      }
      
      return $toString;
    }
    
    @Override
     public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof AsA) {
        AsA that = (AsA) o;
        return this.__typename.equals(that.__typename) && this.id.equals(that.id) && ((this.a == null) ? (that.a == null) : this.a.equals(that.a));
      }
      
      return false;
    }
    
    @Override
     public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= id.hashCode();
        h *= 1000003;
        h ^= (a == null) ? 0 : a.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      
      return $hashCode;
    }
    
    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeCustom((ResponseField.CustomTypeField) $responseFields[1], id);
          writer.writeString($responseFields[2], a != null ? a : null);
        }
      };
    }
    public static final class Mapper implements ResponseFieldMapper<AsA> {
      @Override
       public AsA map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String id = reader.readCustomType((ResponseField.CustomTypeField) $responseFields[1]);
        final String a = reader.readString($responseFields[2]);
        return new AsA(__typename, id, a);
      }
    }
    
  }
  

  public static final class Builder {
    private @Nullable String term;
    Builder() {
      
    }
    
    public Builder term(@Nullable String term) {
      this.term = term;
      return this;
    }
    
    public SearchOneQuery build() {
      return new SearchOneQuery(term);
    }
  }
  

  public static final class Variables extends Operation.Variables {
    private @Nonnull String term;
    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();
    public String term() {
      return term;
    }
    
    public Variables(@Nonnull String term) {
      this.term = term;
      this.valueMap.put("term", term);
    }
    
    @Override
     public Map<String, Object> valueMap() {
      return Collections.unmodifiableMap(valueMap);
    }
    
    @Override
     public InputFieldMarshaller marshaller() {
      return new InputFieldMarshaller() {
        @Override
        public void marshal(InputFieldWriter writer) throws IOException {
          writer.writeString("term", term);
        }
      };
    }
  }
  
}
