package gsontest;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

class Family2 {

	private Integer sharp;
	private String father;
	private String mother;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Integer getSharp() {
		return sharp;
	}

	public void setSharp(Integer sharp) {
		this.sharp = sharp;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMother() {
		return mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

class PersonData {

	private String name;
	private Integer age;
	private String gender;
	private String address;
	private List<String> hobby = null;
	private Family2 family;
	private String company;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public Family2 getFamily() {
		return family;
	}

	public void setFamily(Family2 family) {
		this.family = family;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}

public class GsonEx02 {

	public static void main(String[] args) {
		String jsonPerson = "{\"이름\":\"홍길동\",\"나이\":25,\"성별\":\"여\",\"주소\":\"서울특별시 양천구 목동\",\"특기\":[\"농구\",\"도술\"],\"가족관계\":{\"샵\":2,\"아버지\":\"홍판서\",\"어머니\":\"춘섬\"},\"회사\":\"경기 수원시 팔달구 우만동\"}\r\n"
				+ "";

		Gson gson = new Gson();

	}

}
