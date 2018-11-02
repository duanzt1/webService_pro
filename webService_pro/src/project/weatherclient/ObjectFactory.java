
package project.weatherclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the project.weather.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QryWeatherResponse_QNAME = new QName("http://service.Weather.project/", "qryWeatherResponse");
    private final static QName _QryWeather_QNAME = new QName("http://service.Weather.project/", "qryWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: project.weather.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QryWeatherResponse }
     * 
     */
    public QryWeatherResponse createQryWeatherResponse() {
        return new QryWeatherResponse();
    }

    /**
     * Create an instance of {@link QryWeather }
     * 
     */
    public QryWeather createQryWeather() {
        return new QryWeather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QryWeatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.Weather.project/", name = "qryWeatherResponse")
    public JAXBElement<QryWeatherResponse> createQryWeatherResponse(QryWeatherResponse value) {
        return new JAXBElement<QryWeatherResponse>(_QryWeatherResponse_QNAME, QryWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QryWeather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.Weather.project/", name = "qryWeather")
    public JAXBElement<QryWeather> createQryWeather(QryWeather value) {
        return new JAXBElement<QryWeather>(_QryWeather_QNAME, QryWeather.class, null, value);
    }

}
