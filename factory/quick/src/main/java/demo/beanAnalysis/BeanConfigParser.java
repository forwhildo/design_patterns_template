package demo.beanAnalysis;

import java.io.InputStream;
import java.util.List;

public interface BeanConfigParser {
  List<BeanDefinition> parse(InputStream inputStream);
}



