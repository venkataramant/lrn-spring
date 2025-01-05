package lrn.tvr.examples.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PlainAccount {
	private int id;
	private String name;
}
