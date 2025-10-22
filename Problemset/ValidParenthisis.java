class validParenthisis {
    public boolean isValid(String s) {
        if(s.length()<2) return false;
        char ch=s.charAt(0);
        if(ch==']'|| ch=='}'||ch==')') return false;
      	Stack<Character> stack=new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c=='['|| c=='{'||c=='(') {
				stack.push(c);
			}
			else if(!stack.isEmpty()) {
				if(c==')' && stack.pop()!='(') {
					return false;
				}
				else if(c=='}' && stack.pop()!='{'){
				    return false;
				}else if(c==']' && stack.pop()!='['){
				    return false;
				}
			}else{
                return false;
            }
		}
		return stack.isEmpty();
    }
}