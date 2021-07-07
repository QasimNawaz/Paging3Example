package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.qasim.paging3example.DataBinderMapperImpl());
  }
}
