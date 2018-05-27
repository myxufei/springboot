package com.core.jwt;

//@Component
//public class JwtUtil {
//	@Autowired
//	private JwtConfig jwtConfig;
//
//	public Claims parseJWT(String jsonWebToken, String base64Security) {
//		try {
//			Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(base64Security))
//					.parseClaimsJws(jsonWebToken).getBody();
//			return claims;
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		return null;
//	}
//
//	public String createJWT(User user, String sessionId, String base64Security) {
//		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
//		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(base64Security);
//		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
//		JwtBuilder builder = Jwts.builder().setId(user.getUid()).setSubject(user.getAccount()).setAudience(sessionId)
//				.signWith(signatureAlgorithm, signingKey)
//				.setExpiration(new Date(System.currentTimeMillis() + jwtConfig.getExpiration()))
//				.setNotBefore(new Date(System.currentTimeMillis()));
//
//		return builder.compact();
//	}
//}
